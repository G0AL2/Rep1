package s7;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;

/* compiled from: ItemViewHolder.java */
/* loaded from: classes2.dex */
public class i extends RecyclerView.d0 {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f36780a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f36781b;

    /* renamed from: c  reason: collision with root package name */
    private final CheckBox f36782c;

    /* renamed from: d  reason: collision with root package name */
    private final FlexboxLayout f36783d;

    /* renamed from: e  reason: collision with root package name */
    private final View f36784e;

    public i(View view) {
        super(view);
        this.f36784e = view;
        this.f36780a = (TextView) view.findViewById(com.google.android.ads.mediationtestsuite.d.f20823x);
        this.f36781b = (TextView) view.findViewById(com.google.android.ads.mediationtestsuite.d.f20810k);
        this.f36782c = (CheckBox) view.findViewById(com.google.android.ads.mediationtestsuite.d.f20806g);
        this.f36783d = (FlexboxLayout) view.findViewById(com.google.android.ads.mediationtestsuite.d.f20804e);
    }

    public FlexboxLayout c() {
        return this.f36783d;
    }

    public CheckBox d() {
        return this.f36782c;
    }

    public TextView e() {
        return this.f36781b;
    }

    public TextView f() {
        return this.f36780a;
    }

    public View g() {
        return this.f36784e;
    }
}
