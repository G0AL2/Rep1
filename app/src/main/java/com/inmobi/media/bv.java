package com.inmobi.media;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: NativeContainerAsset.java */
/* loaded from: classes3.dex */
public final class bv extends bt implements Iterable<bt> {
    public byte A;
    bt[] B;
    int C;

    /* renamed from: z  reason: collision with root package name */
    public long f24845z;

    /* compiled from: NativeContainerAsset.java */
    /* loaded from: classes3.dex */
    class a implements Iterator<bt> {

        /* renamed from: b  reason: collision with root package name */
        private int f24847b = 0;

        public a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f24847b < bv.this.C;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ bt next() {
            bt[] btVarArr = bv.this.B;
            int i10 = this.f24847b;
            this.f24847b = i10 + 1;
            return btVarArr[i10];
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public bv(String str, String str2, bu buVar, byte b10, JSONObject jSONObject, byte b11) {
        this(str, str2, buVar, new LinkedList(), b10, jSONObject, b11);
    }

    @Override // java.lang.Iterable
    public final Iterator<bt> iterator() {
        return new a();
    }

    public bv(String str, String str2, bu buVar, List<cf> list, byte b10, JSONObject jSONObject, byte b11) {
        super(str, str2, "CONTAINER", buVar, list);
        this.f24845z = 0L;
        this.f24814f = jSONObject;
        this.B = new bt[1];
        this.f24817i = b10;
        this.C = 0;
        this.A = b11;
    }

    public final boolean a() {
        return "root".equalsIgnoreCase(this.f24812d);
    }

    public final boolean b() {
        return "card_scrollable".equalsIgnoreCase(this.f24812d);
    }

    public final bt a(int i10) {
        if (i10 < 0 || i10 >= this.C) {
            return null;
        }
        return this.B[i10];
    }
}
