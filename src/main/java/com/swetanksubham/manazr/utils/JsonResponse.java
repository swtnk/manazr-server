package com.swetanksubham.manazr.utils;

public class JsonResponse<T> {
    private final T data;
    public JsonResponse(T data) {
        this.data = data;
    }

    public T getResult() {
        return data;
    }
}
