package org.designPattern.creational.prototypeAndRegistry;

    /**
     * 	•Primitive fields (int, double, boolean, etc.) → always copied by value → independent in shallow copy.
     * 	•Immutable objects (String, Integer, etc.) → look safe because you can’t modify them, only reassign → no shared mutation problem.
     * 	•Mutable objects (ArrayList, HashMap, custom classes, etc.) → copied by reference in shallow copy → changing one affects the other.
     */
interface Prototype extends Cloneable {
    Prototype clone();
}
