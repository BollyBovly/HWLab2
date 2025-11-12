package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;

@Getter
@AllArgsConstructor
public class Warehouse<T> {
    protected final List<T> items = new ArrayList<>();
    protected final Deque<T> orders = new ArrayDeque<>();

    public List<T> getItems(){
        return new ArrayList<>(items);
    }

    public void addItem(T item){
        items.add(item);
    }

    public void addOrder(T item){
        if (items.remove(item)){
            orders.addLast(item);
        } else {
            throw new IllegalArgumentException("Товр недоступен на складе");
        }
    }

    public T processOrder() {
        if (orders.isEmpty()) {
            throw new NoSuchElementException("Нету заказов");
        }
        return orders.removeFirst();
    }

    public void addVIPOrder(T item) {
        if (items.remove(item)) {
            orders.addFirst(item);
        } else {
            throw new IllegalStateException("Item not available in warehouse");
        }
    }

    public int getOrdersCount() {
        return orders.size();
    }
}
