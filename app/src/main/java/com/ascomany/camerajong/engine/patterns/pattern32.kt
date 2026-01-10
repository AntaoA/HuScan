package com.ascomany.camerajong.engine.patterns

import com.ascomany.camerajong.engine.Grouping
import com.ascomany.camerajong.engine.Tile
import com.ascomany.camerajong.engine.Wind

val pattern32 = listOf(
    Pattern(
        id = 18,
        name = "All Terminals and Honors",
        description = "The pair(s), Pungs or Kongs is all made up of 1 or 9 Number Tiles and Honor Tiles.",
        points = 32,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 17,
        name = "Three Kongs",
        description = "A hand containing three Kongs. (Points for concealment may be added).",
        points = 32,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 16,
        name = "Four Pure Shifted Chows",
        description = "Four chows in one suit each shifted up 1 or 2 numbers from the last, but not a combination of both.",
        points = 32,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    )
)