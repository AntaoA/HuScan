package com.ascomany.camerajong.engine.patterns

import com.ascomany.camerajong.engine.Grouping
import com.ascomany.camerajong.engine.isTerminalOrHonor
import com.ascomany.camerajong.engine.WinType

val pattern4 = listOf(
    Pattern(
        id = 55,
        name = "Outside Hand",
        description = "Hand includes terminals and honors in each set, including the pair.",
        points = 4,
        excludedPatternIds = emptyList(),
        check = { hand ->
            val valid = hand.groupings.all { grouping ->
                grouping.tiles.any { it.isTerminalOrHonor() }
            }
            if (valid) 1 else 0
        }
    ),
    Pattern(
        id = 56,
        name = "Fully Concealed Hand",
        description = "A hand completed without any melds and won by self-draw.",
        points = 4,
        excludedPatternIds = listOf(80), // Self-Drawn
        check = { hand ->
            val isConcealed = hand.groupings.all { !it.isExposed }
            if (isConcealed && hand.winType == WinType.SELF_DRAWN) 1 else 0
        }
    ),
    Pattern(
        id = 57,
        name = "Two Melded Kongs",
        description = "Hand includes two melded kongs.",
        points = 4,
        excludedPatternIds = emptyList(),
        check = { hand ->
            if (hand.groupings.count { it is Grouping.Kong && it.isExposed } == 2) 1 else 0
        }
    ),
    Pattern(
        id = 58,
        name = "Last Tile",
        description = "Winning on a tile that is the last of its kind.",
        points = 4,
        excludedPatternIds = emptyList(),
        check = { hand ->
            if (hand.isLastOfKind) 1 else 0
        }
    )
)