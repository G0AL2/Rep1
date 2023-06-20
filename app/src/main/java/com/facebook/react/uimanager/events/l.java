package com.facebook.react.uimanager.events;

/* compiled from: TouchEventType.java */
/* loaded from: classes.dex */
public enum l {
    START("topTouchStart"),
    END("topTouchEnd"),
    MOVE("topTouchMove"),
    CANCEL("topTouchCancel");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f15848a;

    l(String str) {
        this.f15848a = str;
    }

    public static String a(l lVar) {
        return lVar.f();
    }

    public String f() {
        return this.f15848a;
    }
}
