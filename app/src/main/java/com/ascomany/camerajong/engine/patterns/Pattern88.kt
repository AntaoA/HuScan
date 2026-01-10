package com.ascomany.camerajong.engine.patterns

import com.ascomany.camerajong.engine.Grouping
import com.ascomany.camerajong.engine.Tile
import com.ascomany.camerajong.engine.Wind

val pattern88 = listOf(
    Pattern(
        id = 7,
        name = "Thirteen Orphans",
        description = "A hand created by singles of any 12 of the 1, 9, and Honor tiles, along with a pair of the 13th. (Fully Concealed may be combined if Self-Drawn).",
        points = 88,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 6,
        name = "Seven Shifted Pairs",
        description = "A hand formed by seven pairs of the same suit, each shifted one up from the last. (Fully Concealed may be combined if Self-Drawn).",
        points = 88,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 5,
        name = "Four Kongs",
        description = "Any hand that includes four kongs. They may be concealed or melded.",
        points = 88,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 4,
        name = "Nine Gates",
        description = "Holding the 1,1,1,2,3,4,5,6,7,8,9,9,9 tiles in any one of the suits, creating the nine-sided wait of 1,2,3,4,5,6,7,8,9. (Fully Concealed may be combined if Self-Drawn).",
        points = 88,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 3,
        name = "All Green",
        description = "A hand in which the chows, pungs and pair(s) are made up solely of \"green\" tiles: 2 Bam, 3 Bam, 4 Bam, 6 Bam, 8 Bam, and Green Dragon.",
        points = 88,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 2,
        name = "Big Three Dragons",
        description = "Pungs or Kongs of all three Dragon Tiles",
        points = 88,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 1,
        name = "Big Four Winds",
        description = "Pungs or Kongs of all four Wind Tiles",
        points = 88,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    )
)