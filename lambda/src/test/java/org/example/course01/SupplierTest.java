package org.example.course01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

public class SupplierTest {
    /*
     * Supplier 只有在 get() 被調用時才會執行，這就是延遲計算 (Lazy Evaluation)。
        適合用於需要降低資源消耗的操作（例如：資料庫查詢、API 請求）。
     */
    @Test
    public void supplier_test01() {
        Supplier<String> messageSupplier = () -> "Hello, Supplier!";
        assertEquals("Hello, Supplier!", messageSupplier.get());
    }
}
