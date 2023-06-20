package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsonArray.java */
/* loaded from: classes3.dex */
public final class e extends h implements Iterable<h> {

    /* renamed from: a  reason: collision with root package name */
    private final List<h> f23716a = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof e) && ((e) obj).f23716a.equals(this.f23716a));
    }

    @Override // com.google.gson.h
    public String h() {
        if (this.f23716a.size() == 1) {
            return this.f23716a.get(0).h();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.f23716a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<h> iterator() {
        return this.f23716a.iterator();
    }

    public void m(h hVar) {
        if (hVar == null) {
            hVar = j.f23891a;
        }
        this.f23716a.add(hVar);
    }
}
