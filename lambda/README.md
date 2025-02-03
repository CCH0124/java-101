### Function
`Function` 是一個接受參數 `T` 類型的物件，並傳回一個 `R` 類型的物件。參數和輸出可以是不同的型別。

- T: 函數輸入類型
- R: 函數結果類型

```
Function<T, R>	
    R apply(T t)
```

### BiFunction

接受兩個參數並傳回一個物件。


```
BiFunction<T, U, R>
    R apply(T t, U u);
```

- T 函數第一個參數型別
- U 函數第二個參數型別
- R 函數結果類型

### BinaryOperator 

兩個相同類型的參數並傳回和參數相同類型的結果。其繼層 `BiFunction`

```
BinaryOperator<T> extends BiFunction<T,T,T> 
```

如果涉及 `primitive` 類型如 `int` 就可以使用 `IntBinaryOperator`。

### UnaryOperator

接受一個參數，並傳回與其參數相同類型的結果。繼層 `Function`。

```
UnaryOperator<T> extends Function<T, T>
```

### BiPredicate 

接受兩個參數並返回一個布林值

```
 BiPredicate<T, U> 
    boolean test(T t, U u);
```

### Consumer
接受一個參數但不傳回任何內容。

```
Consumer<T> 
  void accept(T t);
```

### BiConsumer 
它接受兩個參數但不傳回任何內容。

```
 BiConsumer<T, U> 
  void accept(T t, U u);
```

### Supplier
它不需要任何參數並傳回結果

```
Supplier<T>
    T get();

```