package com.ascomany.camerajong.engine.patterns

import com.ascomany.camerajong.engine.Grouping
import com.ascomany.camerajong.engine.Tile
import com.ascomany.camerajong.engine.Wind

val pattern24 = listOf(
    Pattern(
        id = 27,
        name = "Lower Tiles",
        description = "A hand consisting entirely of 1, 2, and 3 tiles.",
        points = 24,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 26,
        name = "Middle Tiles",
        description = "A hand consisting entirely of 4, 5, and 6 tiles.",
        points = 24,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 25,
        name = "Upper Tiles",
        description = "A hand consisting entirely of 7, 8, and 9 tiles.",
        points = 24,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 24,
        name = "Pure Shifted Pungs",
        description = "Three Pungs or Kongs of the same suit, each shifted one up from the last.",
        points = 24,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 23,
        name = "Pure Triple Chow",
        description = "Three chows of the same numerical sequence and in the same suit.",
        points = 24,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 22,
        name = "Full Flush",
        description = "A hand formed entirely of a single suit.",
        points = 24,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 21,
        name = "All Even Pungs",
        description = "A hand formed with Pungs or Kongs of 2, 4, 6, and 8 tiles, with a pair of the same.",
        points = 24,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 20,
        name = "Greater Honors and Knitted Tiles",
        description = "Formed by seven single honors and singles of suit tiles belonging to separate Knitted sequences (for example, 1-4-7 of Bamboos, 2-5-8 of Characters, and 3-6-9 of Dots). Fully Concealed may be combined if Self-Drawn.",
        points = 24,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 19,
        name = "Seven Pairs",
        description = "A hand formed by seven pairs. (Fully Concealed may be combined if Self-Drawn).",
        points = 24,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    )
)