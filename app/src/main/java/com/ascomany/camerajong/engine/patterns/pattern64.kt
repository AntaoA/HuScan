package com.ascomany.camerajong.engine.patterns

import com.ascomany.camerajong.engine.Grouping
import com.ascomany.camerajong.engine.Tile
import com.ascomany.camerajong.engine.Wind

val pattern64 = listOf(
    Pattern(
        id = 13,
        name = "Pure Terminal Chows",
        description = "A hand consisting of two each of the lower and upper terminal Chows in one suit only, and a pair of fives in the same suit.",
        points = 64,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 12,
        name = "Four Concealed Pungs",
        description = "A hand that includes four Concealed Pungs or Kongs (achieved without melding — Fully Concealed may be combined if Self-Drawn).",
        points = 64,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 11,
        name = "All Honor",
        description = "The pair(s), Pungs or Kongs are all made up of Honor Tiles.",
        points = 64,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 10,
        name = "Little Three Dragons",
        description = "A hand that includes two Pungs or Kongs of the Dragon Tiles and a pair of the third Dragon.",
        points = 64,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 9,
        name = "Little Four Winds",
        description = "A hand that includes three Pungs or Kongs of Wind Tiles and a pair of the fourth Wind.",
        points = 64,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 8,
        name = "All Terminals",
        description = "The pair(s), Pungs or Kongs are all made up of 1 or 9 Number Tiles, without Honor Tiles.",
        points = 64,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    )
)