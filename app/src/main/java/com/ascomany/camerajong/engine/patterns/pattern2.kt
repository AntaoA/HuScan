package com.ascomany.camerajong.engine.patterns

import com.ascomany.camerajong.engine.Grouping
import com.ascomany.camerajong.engine.Tile
import com.ascomany.camerajong.engine.Wind

val pattern2 = listOf(
    Pattern(
        id = 68,
        name = "All Simples",
        description = "A hand formed without Terminal or Honor Tiles.",
        points = 2,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 67,
        name = "Concealed Kong",
        description = "Created when four identical tiles, all self-drawn, are declared as a Kong.",
        points = 2,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 66,
        name = "Two Concealed Pungs",
        description = "Two Pungs achieved without melding.",
        points = 2,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 65,
        name = "Double Pung",
        description = "Two Pungs (or Kongs) of the same number in two different suits.",
        points = 2,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 64,
        name = "Tile Hog",
        description = "Using all four of a single suit tile, without using them as a Kong",
        points = 2,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 63,
        name = "All Chows",
        description = "A hand consisting of all chows, with no Honors.",
        points = 2,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 62,
        name = "Concealed Hand",
        description = "Having a concealed hand (no melded sets) and winning by discard",
        points = 2,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 61,
        name = "Seat Wind",
        description = "A Pung or Kong of the Wind Tile corresponding to the player's Seat position at the table. (Dealer is East; proceeding counter-clockwise from the Dealer; other players' seats are South, West, and North.)",
        points = 2,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 60,
        name = "Prevalent Wind",
        description = "A Pung or Kong of the Wind Tile corresponding to the current Prevalent Wind.",
        points = 2,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    ),
    Pattern(
        id = 59,
        name = "Dragon Pung",
        description = "A Pung or Kong of Dragon Tiles.",
        points = 2,
        excludedPatternIds = emptyList(),
        check = { hand -> 0}
    )
)