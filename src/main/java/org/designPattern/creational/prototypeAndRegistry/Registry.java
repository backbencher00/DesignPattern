package org.designPattern.creational.prototypeAndRegistry;

import java.util.HashMap;

class Registry{
    private HashMap<String, Prototype> register;
    public void register(String key, Prototype prototype){
        if(this.register == null){
            this.register = new HashMap<>();
        }
        this.register.put(key, prototype);
    }

    public Prototype get(String key) throws Exception {
        if(this.register.get(key)==null){
            throw new Exception("No prototype exist");
        }else {
            return this.register.get(key).clone();
        }

    }
}