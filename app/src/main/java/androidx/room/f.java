package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.room.k0;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import z0.h;

/* compiled from: DatabaseConfiguration.kt */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3891a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3892b;

    /* renamed from: c  reason: collision with root package name */
    public final h.c f3893c;

    /* renamed from: d  reason: collision with root package name */
    public final k0.e f3894d;

    /* renamed from: e  reason: collision with root package name */
    public final List<k0.b> f3895e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3896f;

    /* renamed from: g  reason: collision with root package name */
    public final k0.d f3897g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f3898h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f3899i;

    /* renamed from: j  reason: collision with root package name */
    public final Intent f3900j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f3901k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f3902l;

    /* renamed from: m  reason: collision with root package name */
    private final Set<Integer> f3903m;

    /* renamed from: n  reason: collision with root package name */
    public final k0.f f3904n;

    /* renamed from: o  reason: collision with root package name */
    public final List<Object> f3905o;

    /* renamed from: p  reason: collision with root package name */
    public final List<x0.a> f3906p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f3907q;

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"LambdaLast"})
    public f(Context context, String str, h.c cVar, k0.e eVar, List<? extends k0.b> list, boolean z10, k0.d dVar, Executor executor, Executor executor2, Intent intent, boolean z11, boolean z12, Set<Integer> set, String str2, File file, Callable<InputStream> callable, k0.f fVar, List<? extends Object> list2, List<? extends x0.a> list3) {
        qe.k.f(context, "context");
        qe.k.f(cVar, "sqliteOpenHelperFactory");
        qe.k.f(eVar, "migrationContainer");
        qe.k.f(dVar, "journalMode");
        qe.k.f(executor, "queryExecutor");
        qe.k.f(executor2, "transactionExecutor");
        qe.k.f(list2, "typeConverters");
        qe.k.f(list3, "autoMigrationSpecs");
        this.f3891a = context;
        this.f3892b = str;
        this.f3893c = cVar;
        this.f3894d = eVar;
        this.f3895e = list;
        this.f3896f = z10;
        this.f3897g = dVar;
        this.f3898h = executor;
        this.f3899i = executor2;
        this.f3900j = intent;
        this.f3901k = z11;
        this.f3902l = z12;
        this.f3903m = set;
        this.f3905o = list2;
        this.f3906p = list3;
        this.f3907q = intent != null;
    }

    public boolean a(int i10, int i11) {
        Set<Integer> set;
        return !((i10 > i11) && this.f3902l) && this.f3901k && ((set = this.f3903m) == null || !set.contains(Integer.valueOf(i10)));
    }
}
