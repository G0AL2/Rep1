package com.fyber.inneractive.sdk.mraid;

/* loaded from: classes.dex */
public abstract class t {
    public abstract String a();

    public String toString() {
        String a10 = a();
        return a10 != null ? a10.replaceAll("[^a-zA-Z0-9_,:\\s\\{\\}\\'\\\"]", "") : "";
    }
}
