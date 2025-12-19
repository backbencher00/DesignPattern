The flyweight pattern is used when you have:

•        a large number of similar objects, and

•        most of their state is identical (intrinsic state), and

•        only a small part varies (extrinsic state).

Instead of creating thousands/millions of objects, you reuse a small set of shared ones.

1️⃣ Intrinsic State (shared)

•        Does not change from object to object.

•        Stored inside the Flyweight object.

•        Shared among many.

2️⃣ Extrinsic State (unique)

•        Varies per usage.

•        Passed from outside when needed.

•        Not stored inside the Flyweight.

In chess:

•	You don’t need 32 separate full objects for pieces.

•	You can create one shared object for each piece type:

•	King

•	Queen

•	Rook

•	Bishop

•	Knight

•	Pawn

These objects store only intrinsic (shared) data like:

•	Piece name

•	Movement rules (dummy in example)

•	Icon/character representation

The changing (per-position) data is extrinsic:

•	Row, column

•	Color (can be extrinsic or intrinsic — we keep it extrinsic here)
