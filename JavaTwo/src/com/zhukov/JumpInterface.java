package com.zhukov;

public interface JumpInterface extends MyInterface {
    void jump();
    default void superJump() {
        System.out.println("Super Jump!!!");
    }

}
