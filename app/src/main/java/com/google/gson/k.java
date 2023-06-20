package com.google.gson;

import java.util.Map;
import java.util.Set;

/* compiled from: JsonObject.java */
/* loaded from: classes3.dex */
public final class k extends h {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.gson.internal.g<String, h> f23892a = new com.google.gson.internal.g<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof k) && ((k) obj).f23892a.equals(this.f23892a));
    }

    public int hashCode() {
        return this.f23892a.hashCode();
    }

    public void m(String str, h hVar) {
        if (hVar == null) {
            hVar = j.f23891a;
        }
        this.f23892a.put(str, hVar);
    }

    public Set<Map.Entry<String, h>> n() {
        return this.f23892a.entrySet();
    }

    public h o(String str) {
        return this.f23892a.get(str);
    }

    public e p(String str) {
        return (e) this.f23892a.get(str);
    }
}
