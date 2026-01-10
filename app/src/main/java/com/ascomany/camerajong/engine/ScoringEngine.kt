package com.ascomany.camerajong.engine

import com.ascomany.camerajong.engine.patterns.*

data class ScoringResult(
    val totalPoints: Int,
    val detailedPatterns: List<AppliedPattern>,
    val isWin: Boolean
)

data class AppliedPattern(
    val id: Int,
    val name: String,
    val points: Int,
    val count: Int
)

class ScoringEngine {
    private val allPatterns: List<Pattern> =
        pattern88 + pattern64 + pattern48 + pattern32 +
                pattern24 + pattern16 + pattern12 + pattern8 +
                pattern6 + pattern4 + pattern2 + pattern1

    fun calculateScore(hand: WinningHand): ScoringResult {
        val detected = allPatterns.mapNotNull { pattern ->
            val count = pattern.check(hand)
            if (count > 0) pattern to count else null
        }.toMap()

        val excludedIds = detected.keys.flatMap { it.excludedPatternIds }.toSet()
        val finalPatterns = detected.filter { (pattern, _) ->
            pattern.id !in excludedIds
        }

        var total = finalPatterns.entries.sumOf { (pattern, count) ->
            pattern.points * count
        }

        val appliedDetails = if (total == 0) {
            total = 8
            listOf(AppliedPattern(43, "Chicken Hand", 8, 1))
        } else {
            finalPatterns.map { (pattern, count) ->
                AppliedPattern(pattern.id, pattern.name, pattern.points, count)
            }
        }

        return ScoringResult(
            totalPoints = total,
            detailedPatterns = appliedDetails.sortedByDescending { it.points },
            isWin = total >= 8
        )
    }
}