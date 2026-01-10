package com.ascomany.camerajong.engine.patterns

import com.ascomany.camerajong.engine.Grouping
import com.ascomany.camerajong.engine.Tile
import com.ascomany.camerajong.engine.Wind

val pattern4 = listOf(
    Pattern(
        id = 58,
        name = "Last Tile",
        description = "Winning on a tile that is the last of its kind. (It must be clear to all players based on the discards and exposures.)",
        points = 4,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 57,
        name = "Two Melded Kongs",
        description = "A hand that includes two Melded Kongs. One Melded Kong and one Concealed Kong are 6 points.",
        points = 4,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 56,
        name = "Fully Concealed Hand",
        description = "A hand that a player completes without any melds, and wins by Self-Draw.",
        points = 4,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 55,
        name = "Outside Hand",
        description = "A hand that includes terminals and honors in each set, including the pair.",
        points = 4,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    )
)