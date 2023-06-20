package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.bytedance.sdk.openadsdk.dislike.c;
import com.bytedance.sdk.openadsdk.utils.v;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class TTAdDislikeDialog extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private View f11230a;

    /* renamed from: b  reason: collision with root package name */
    private TTDislikeListView f11231b;

    /* renamed from: c  reason: collision with root package name */
    private TTDislikeListView f11232c;

    /* renamed from: d  reason: collision with root package name */
    private RelativeLayout f11233d;

    /* renamed from: e  reason: collision with root package name */
    private View f11234e;

    /* renamed from: f  reason: collision with root package name */
    private c.b f11235f;

    /* renamed from: g  reason: collision with root package name */
    private c.b f11236g;

    /* renamed from: h  reason: collision with root package name */
    private n f11237h;

    /* renamed from: i  reason: collision with root package name */
    private a f11238i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11239j;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i10, FilterWord filterWord);

        void a(View view);

        void b(View view);

        void c(View view);
    }

    public TTAdDislikeDialog(Context context, n nVar) {
        this(context.getApplicationContext());
        this.f11237h = nVar;
        c();
    }

    private void d() {
        this.f11233d = (RelativeLayout) this.f11230a.findViewById(t.e(getContext(), "tt_dislike_title_content"));
        this.f11234e = this.f11230a.findViewById(t.e(getContext(), "tt_dislike_line1"));
        TextView textView = (TextView) this.f11230a.findViewById(t.e(getContext(), "tt_dislike_header_back"));
        textView.setText(t.a(getContext(), "tt_dislike_header_tv_back"));
        ((TextView) this.f11230a.findViewById(t.e(getContext(), "tt_dislike_header_tv"))).setText(t.a(getContext(), "tt_dislike_header_tv_title"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTAdDislikeDialog.this.e();
                if (TTAdDislikeDialog.this.f11238i != null) {
                    TTAdDislikeDialog.this.f11238i.c(view);
                }
            }
        });
        TTDislikeListView tTDislikeListView = (TTDislikeListView) this.f11230a.findViewById(t.e(getContext(), "tt_filer_words_lv"));
        this.f11231b = tTDislikeListView;
        tTDislikeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.3
            /* JADX WARN: Type inference failed for: r1v6, types: [android.widget.Adapter] */
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                try {
                    FilterWord filterWord = (FilterWord) adapterView.getAdapter().getItem(i10);
                    if (filterWord.hasSecondOptions()) {
                        TTAdDislikeDialog.this.a(filterWord);
                        if (TTAdDislikeDialog.this.f11238i != null) {
                            TTAdDislikeDialog.this.f11238i.a(i10, filterWord);
                            return;
                        }
                        return;
                    }
                } catch (Throwable unused) {
                }
                if (TTAdDislikeDialog.this.f11238i != null) {
                    try {
                        TTAdDislikeDialog.this.f11238i.a(i10, TTAdDislikeDialog.this.f11237h.ae().get(i10));
                    } catch (Throwable unused2) {
                    }
                }
                TTAdDislikeDialog.this.b();
            }
        });
        TTDislikeListView tTDislikeListView2 = (TTDislikeListView) this.f11230a.findViewById(t.e(getContext(), "tt_filer_words_lv_second"));
        this.f11232c = tTDislikeListView2;
        tTDislikeListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.4
            /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.Adapter] */
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                if (TTAdDislikeDialog.this.f11238i != null) {
                    try {
                        TTAdDislikeDialog.this.f11238i.a(i10, (FilterWord) adapterView.getAdapter().getItem(i10));
                    } catch (Throwable unused) {
                    }
                }
                TTAdDislikeDialog.this.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        RelativeLayout relativeLayout = this.f11233d;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        View view = this.f11234e;
        if (view != null) {
            view.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView = this.f11231b;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(0);
        }
        c.b bVar = this.f11236g;
        if (bVar != null) {
            bVar.a();
        }
        TTDislikeListView tTDislikeListView2 = this.f11232c;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(8);
        }
    }

    public void setCallback(a aVar) {
        this.f11238i = aVar;
    }

    private void c() {
        if (this.f11237h == null) {
            return;
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        c.b bVar = new c.b(from, this.f11237h.ae());
        this.f11235f = bVar;
        this.f11231b.setAdapter((ListAdapter) bVar);
        c.b bVar2 = new c.b(from, new ArrayList());
        this.f11236g = bVar2;
        bVar2.a(false);
        this.f11232c.setAdapter((ListAdapter) this.f11236g);
        this.f11231b.setMaterialMeta(this.f11237h);
        this.f11232c.setMaterialMeta(this.f11237h);
    }

    public void b() {
        setVisibility(8);
        this.f11239j = false;
        a aVar = this.f11238i;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTAdDislikeDialog.this.b();
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.f11230a = LayoutInflater.from(context).inflate(t.f(context, "tt_dislike_dialog_layout"), (ViewGroup) this, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = v.e(getContext(), 20.0f);
        layoutParams.rightMargin = v.e(getContext(), 20.0f);
        this.f11230a.setLayoutParams(layoutParams);
        this.f11230a.setClickable(true);
        d();
        c();
    }

    public TTAdDislikeDialog(Context context) {
        this(context, (AttributeSet) null);
    }

    public TTAdDislikeDialog(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeDialog(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11239j = false;
        a(context, attributeSet);
    }

    public void a() {
        if (this.f11230a.getParent() == null) {
            addView(this.f11230a);
        }
        e();
        setVisibility(0);
        this.f11239j = true;
        a aVar = this.f11238i;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        c.b bVar = this.f11236g;
        if (bVar != null) {
            bVar.a(filterWord.getOptions());
        }
        RelativeLayout relativeLayout = this.f11233d;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        View view = this.f11234e;
        if (view != null) {
            view.setVisibility(0);
        }
        TTDislikeListView tTDislikeListView = this.f11231b;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView2 = this.f11232c;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(0);
        }
    }
}
