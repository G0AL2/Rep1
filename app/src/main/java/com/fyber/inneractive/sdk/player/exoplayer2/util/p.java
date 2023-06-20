package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: h  reason: collision with root package name */
    public static final Comparator<c> f19587h = new a();

    /* renamed from: i  reason: collision with root package name */
    public static final Comparator<c> f19588i = new b();

    /* renamed from: a  reason: collision with root package name */
    public final int f19589a;

    /* renamed from: e  reason: collision with root package name */
    public int f19593e;

    /* renamed from: f  reason: collision with root package name */
    public int f19594f;

    /* renamed from: g  reason: collision with root package name */
    public int f19595g;

    /* renamed from: c  reason: collision with root package name */
    public final c[] f19591c = new c[5];

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<c> f19590b = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public int f19592d = -1;

    /* loaded from: classes2.dex */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public int compare(c cVar, c cVar2) {
            return cVar.f19596a - cVar2.f19596a;
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Comparator<c> {
        @Override // java.util.Comparator
        public int compare(c cVar, c cVar2) {
            float f10 = cVar.f19598c;
            float f11 = cVar2.f19598c;
            if (f10 < f11) {
                return -1;
            }
            return f11 < f10 ? 1 : 0;
        }
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f19596a;

        /* renamed from: b  reason: collision with root package name */
        public int f19597b;

        /* renamed from: c  reason: collision with root package name */
        public float f19598c;
    }

    public p(int i10) {
        this.f19589a = i10;
    }
}
