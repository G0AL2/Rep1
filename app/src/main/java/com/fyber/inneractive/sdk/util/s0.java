package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.List;

/* loaded from: classes2.dex */
public class s0 implements Comparable<s0> {

    /* renamed from: a  reason: collision with root package name */
    public a f20325a;

    /* renamed from: b  reason: collision with root package name */
    public Uri f20326b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f20327c;

    /* loaded from: classes2.dex */
    public enum a {
        Primary(1),
        FallBack(2);
        

        /* renamed from: a  reason: collision with root package name */
        public Integer f20331a;

        a(Integer num) {
            this.f20331a = num;
        }
    }

    public s0(a aVar, Uri uri, List<String> list) {
        this.f20325a = aVar;
        this.f20326b = uri;
        this.f20327c = list;
    }

    @Override // java.lang.Comparable
    public int compareTo(s0 s0Var) {
        return this.f20325a.f20331a.compareTo(s0Var.f20325a.f20331a);
    }
}
