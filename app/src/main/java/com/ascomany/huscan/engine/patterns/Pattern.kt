package com.ascomany.huscan.engine.patterns

import com.ascomany.huscan.engine.WinningHand

data class Pattern(
    val id: Int,
    val name: String,
    val description: String,
    val points: Int,
    val isSpecialStructure: Boolean = false,
    val excludedPatternIds: List<Int> = emptyList(),
    val check: (WinningHand) -> Int // Number of occurrences of the pattern (useful for patterns that can be present more than once)
)