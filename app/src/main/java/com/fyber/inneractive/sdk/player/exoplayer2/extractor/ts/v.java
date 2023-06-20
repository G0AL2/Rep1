package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public interface v {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f19010a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f19011b;

        public a(String str, int i10, byte[] bArr) {
            this.f19010a = str;
            this.f19011b = bArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f19012a;

        /* renamed from: b  reason: collision with root package name */
        public final List<a> f19013b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f19014c;

        public b(int i10, String str, List<a> list, byte[] bArr) {
            List<a> unmodifiableList;
            this.f19012a = str;
            if (list == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            this.f19013b = unmodifiableList;
            this.f19014c = bArr;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        SparseArray<v> a();

        v a(int i10, b bVar);
    }

    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f19015a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19016b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19017c;

        /* renamed from: d  reason: collision with root package name */
        public int f19018d;

        /* renamed from: e  reason: collision with root package name */
        public String f19019e;

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f19015a = str;
            this.f19016b = i11;
            this.f19017c = i12;
            this.f19018d = RecyclerView.UNDEFINED_DURATION;
        }

        public void a() {
            int i10 = this.f19018d;
            this.f19018d = i10 == Integer.MIN_VALUE ? this.f19016b : i10 + this.f19017c;
            this.f19019e = this.f19015a + this.f19018d;
        }

        public String b() {
            if (this.f19018d != Integer.MIN_VALUE) {
                return this.f19019e;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public int c() {
            int i10 = this.f19018d;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    void a();

    void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, boolean z10);

    void a(com.fyber.inneractive.sdk.player.exoplayer2.util.r rVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, d dVar);
}
