package com.ascomany.camerajong.engine.patterns

import com.ascomany.camerajong.engine.Grouping
import com.ascomany.camerajong.engine.Tile
import com.ascomany.camerajong.engine.Wind

val pattern12 = listOf(
    Pattern(
        id = 38,
        name = "Big Three Winds",
        description = "A hand that includes one pung (or kong) of each of the three winds.",
        points = 12,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 37,
        name = "Lower Five",
        description = "A hand created with suit tiles 1 through 4.",
        points = 12,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 36,
        name = "Upper Five",
        description = "A hand created with suit tiles 6 through 9.",
        points = 12,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 35,
        name = "Knitted Straight",
        description = "A special Straight which is formed not with standard chows but with 3 different Knitted sequences. For example, 1-4-7 of Dots, 2-5-8 of Characters, and 3-6-9 of Bamboos - but not necessarily in the order in this example.",
        points = 12,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    ),
    Pattern(
        id = 34,
        name = "Lesser Honors and Knitted Tiles",
        description = "Formed by single honors, and singles of suit tiles belonging to separate Knitted sequences (for example, 1-4-7 of Bamboo, 2-5-8 of Characters, and 3-6-9 of Dots - each of the 3 suits must belong to a different Knitted sequence, but not necessarily in this order). Fully Concealed may be combined if Self-Drawn.",
        points = 12,
        excludedPatternIds = emptyList(),
        check = { hand -> 0 }
    )
)