package l0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ResourceCursorAdapter.java */
/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: i  reason: collision with root package name */
    private int f33646i;

    /* renamed from: j  reason: collision with root package name */
    private int f33647j;

    /* renamed from: k  reason: collision with root package name */
    private LayoutInflater f33648k;

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f33647j = i10;
        this.f33646i = i10;
        this.f33648k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // l0.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f33648k.inflate(this.f33647j, viewGroup, false);
    }

    @Override // l0.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f33648k.inflate(this.f33646i, viewGroup, false);
    }
}
