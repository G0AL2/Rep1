package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.protobuf.a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f20078a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f20079b;

    /* loaded from: classes2.dex */
    public interface a extends j<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface b extends j<Double> {
    }

    /* loaded from: classes2.dex */
    public interface c {
        int a();
    }

    /* loaded from: classes2.dex */
    public interface d<T extends c> {
        T a(int i10);
    }

    /* loaded from: classes2.dex */
    public interface e {
        boolean a(int i10);
    }

    /* loaded from: classes2.dex */
    public interface f extends j<Float> {
    }

    /* loaded from: classes2.dex */
    public interface g extends j<Integer> {
    }

    /* loaded from: classes2.dex */
    public static class h<F, T> extends AbstractList<T> {

        /* renamed from: a  reason: collision with root package name */
        public final List<F> f20080a;

        /* renamed from: b  reason: collision with root package name */
        public final a<F, T> f20081b;

        /* loaded from: classes2.dex */
        public interface a<F, T> {
        }

        public h(List<F> list, a<F, T> aVar) {
            this.f20080a = list;
            this.f20081b = aVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i10) {
            a<F, T> aVar = this.f20081b;
            F f10 = this.f20080a.get(i10);
            ((TokenParametersOuterClass$TokenParameters.a) aVar).getClass();
            T t10 = (T) TokenParametersOuterClass$TokenParameters.k.a(((Integer) f10).intValue());
            return t10 == null ? (T) TokenParametersOuterClass$TokenParameters.k.UNRECOGNIZED : t10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f20080a.size();
        }
    }

    /* loaded from: classes2.dex */
    public interface i extends j<Long> {
    }

    /* loaded from: classes2.dex */
    public interface j<E> extends List<E>, RandomAccess {
        j<E> b(int i10);

        void b();

        boolean d();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f20079b = bArr;
        ByteBuffer.wrap(bArr);
        com.fyber.inneractive.sdk.protobuf.j.a(bArr, 0, 0, false);
    }

    public static int a(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static <T> T a(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    public static Object a(Object obj, Object obj2) {
        q0 q0Var = (q0) obj2;
        a.AbstractC0264a abstractC0264a = (a.AbstractC0264a) ((q0) obj).toBuilder();
        abstractC0264a.getClass();
        GeneratedMessageLite.a aVar = (GeneratedMessageLite.a) abstractC0264a;
        if (aVar.f19802a.getClass().isInstance(q0Var)) {
            aVar.c();
            aVar.a(aVar.f19803b, (GeneratedMessageLite) ((com.fyber.inneractive.sdk.protobuf.a) q0Var));
            return aVar.b();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
