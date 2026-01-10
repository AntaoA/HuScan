package com.ascomany.camerajong.engine.patterns

import com.ascomany.camerajong.engine.Grouping
import com.ascomany.camerajong.engine.Tile
import com.ascomany.camerajong.engine.Wind

val pattern16 = listOf(
    Pattern(
        id = 33,
        name = "Three Concealed Pungs",
        description = "Three Concealed Pungs or Kongs (achieved without melding).",
        points = 16,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 32,
        name = "Triple Pung",
        description = "Three Pungs (or Kongs) of the same number in each suit.",
        points = 16,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 31,
        name = "All Fives",
        description = "A hand in which every set (chow, pung, kong, pair) includes the number \"5\"",
        points = 16,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 30,
        name = "Pure Shifted Chows",
        description = "Three chows in one suit each shifted either one or two numbers up from the last, but not a combination of both.",
        points = 16,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 29,
        name = "Three-Suited Terminal Chows",
        description = "A hand consisting of 1-2-3 and 7-8-9 in one suit (Two Terminal Chows), 1-2-3 and 7-8-9 in another suit, and a pair of fives in the remaining suit.",
        points = 16,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 28,
        name = "Pure Straight",
        description = "A hand using one each of all the numbers 1 through 9 from any one suit, forming three consecutive chows.",
        points = 16,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    )
)