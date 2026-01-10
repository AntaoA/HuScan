package com.ascomany.camerajong.engine.patterns

import com.ascomany.camerajong.engine.Grouping
import com.ascomany.camerajong.engine.Tile
import com.ascomany.camerajong.engine.Wind

val pattern48 = listOf(
    Pattern(
        id = 15,
        name = "Four Pure Shifted Pungs",
        description = "Four Pungs (or Kongs) in the same suit, each shifted one up from the last.",
        points = 48,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 14,
        name = "Quadruple Chow",
        description = "Four chows of the same continuous number sequence in the same suit.",
        points = 48,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    )
)