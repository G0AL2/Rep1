package z5;

import android.util.SparseIntArray;
import com.google.android.gms.common.api.Api;

/* compiled from: PoolParams.java */
/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public final int f40055a;

    /* renamed from: b  reason: collision with root package name */
    public final int f40056b;

    /* renamed from: c  reason: collision with root package name */
    public final SparseIntArray f40057c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f40058d;

    /* renamed from: e  reason: collision with root package name */
    public final int f40059e;

    public s(int i10, int i11, SparseIntArray sparseIntArray) {
        this(i10, i11, sparseIntArray, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, -1);
    }

    public s(int i10, int i11, SparseIntArray sparseIntArray, int i12, int i13, int i14) {
        y3.k.i(i10 >= 0 && i11 >= i10);
        this.f40056b = i10;
        this.f40055a = i11;
        this.f40057c = sparseIntArray;
        this.f40059e = i14;
    }
}
