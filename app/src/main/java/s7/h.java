package s7;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: InfoViewHolder.java */
/* loaded from: classes2.dex */
public class h extends RecyclerView.d0 {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f36776a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f36777b;

    /* renamed from: c  reason: collision with root package name */
    private final ImageView f36778c;

    /* renamed from: d  reason: collision with root package name */
    private final View f36779d;

    public h(View view) {
        super(view);
        this.f36779d = view;
        this.f36776a = (TextView) view.findViewById(com.google.android.ads.mediationtestsuite.d.f20823x);
        this.f36777b = (TextView) view.findViewById(com.google.android.ads.mediationtestsuite.d.f20810k);
        this.f36778c = (ImageView) view.findViewById(com.google.android.ads.mediationtestsuite.d.f20805f);
    }

    public TextView c() {
        return this.f36777b;
    }

    public ImageView d() {
        return this.f36778c;
    }

    public TextView e() {
        return this.f36776a;
    }

    public View f() {
        return this.f36779d;
    }
}
