package com.bytedance.sdk.openadsdk.dislike;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.utils.v;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TTDislikeDialogDefault.java */
/* loaded from: classes.dex */
public class c extends TTDislikeDialogAbstract {

    /* renamed from: a  reason: collision with root package name */
    private TTDislikeListView f13217a;

    /* renamed from: b  reason: collision with root package name */
    private TTDislikeListView f13218b;

    /* renamed from: c  reason: collision with root package name */
    private RelativeLayout f13219c;

    /* renamed from: d  reason: collision with root package name */
    private View f13220d;

    /* renamed from: e  reason: collision with root package name */
    private b f13221e;

    /* renamed from: f  reason: collision with root package name */
    private b f13222f;

    /* renamed from: g  reason: collision with root package name */
    private n f13223g;

    /* renamed from: h  reason: collision with root package name */
    private a f13224h;

    /* renamed from: i  reason: collision with root package name */
    private String f13225i;

    /* compiled from: TTDislikeDialogDefault.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(int i10, FilterWord filterWord);

        void b();

        void c();
    }

    /* compiled from: TTDislikeDialogDefault.java */
    /* loaded from: classes.dex */
    public static class b extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f13231a = true;

        /* renamed from: b  reason: collision with root package name */
        private final List<FilterWord> f13232b;

        /* renamed from: c  reason: collision with root package name */
        private final LayoutInflater f13233c;

        /* compiled from: TTDislikeDialogDefault.java */
        /* loaded from: classes.dex */
        private static class a {

            /* renamed from: a  reason: collision with root package name */
            TextView f13234a;

            /* renamed from: b  reason: collision with root package name */
            ImageView f13235b;

            private a() {
            }
        }

        public b(LayoutInflater layoutInflater, List<FilterWord> list) {
            this.f13232b = list;
            this.f13233c = layoutInflater;
        }

        public void a(boolean z10) {
            this.f13231a = z10;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<FilterWord> list = this.f13232b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return this.f13232b.get(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            View view2;
            a aVar;
            if (view == null) {
                aVar = new a();
                LayoutInflater layoutInflater = this.f13233c;
                view2 = layoutInflater.inflate(t.f(layoutInflater.getContext(), "tt_dialog_listview_item"), viewGroup, false);
                aVar.f13234a = (TextView) view2.findViewById(t.e(this.f13233c.getContext(), "tt_item_tv"));
                aVar.f13235b = (ImageView) view2.findViewById(t.e(this.f13233c.getContext(), "tt_item_arrow"));
                view2.setTag(aVar);
            } else {
                view2 = view;
                aVar = (a) view.getTag();
            }
            FilterWord filterWord = this.f13232b.get(i10);
            aVar.f13234a.setText(filterWord.getName());
            if (i10 != this.f13232b.size() - 1) {
                aVar.f13234a.setBackgroundResource(t.d(this.f13233c.getContext(), "tt_dislike_middle_seletor"));
            } else {
                aVar.f13234a.setBackgroundResource(t.d(this.f13233c.getContext(), "tt_dislike_bottom_seletor"));
            }
            if (this.f13231a && i10 == 0) {
                aVar.f13234a.setBackgroundResource(t.d(this.f13233c.getContext(), "tt_dislike_top_seletor"));
            }
            if (filterWord.hasSecondOptions()) {
                aVar.f13235b.setVisibility(0);
            } else {
                aVar.f13235b.setVisibility(8);
            }
            return view2;
        }

        public void a(List<FilterWord> list) {
            if (list == null || list.isEmpty()) {
                return;
            }
            this.f13232b.clear();
            this.f13232b.addAll(list);
            notifyDataSetChanged();
        }

        public void a() {
            this.f13232b.clear();
            notifyDataSetChanged();
        }
    }

    public c(Context context, n nVar) {
        super(context, t.g(context, "tt_dislikeDialog"));
        this.f13223g = nVar;
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public int getLayoutId() {
        return t.f(getContext(), "tt_dislike_dialog_layout");
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(v.c(getContext()) - 120, -2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public int[] getTTDislikeListViewIds() {
        return new int[]{t.e(getContext(), "tt_filer_words_lv"), t.e(getContext(), "tt_filer_words_lv_second")};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        a();
        a(getContext());
        b();
        setMaterialMeta(this.f13223g);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        c();
    }

    private void b() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.dislike.c.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                if (c.this.f13224h != null) {
                    c.this.f13224h.a();
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.dislike.c.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (c.this.f13224h != null) {
                    c.this.f13224h.b();
                }
            }
        });
        b bVar = new b(getLayoutInflater(), this.f13223g.ae());
        this.f13221e = bVar;
        this.f13217a.setAdapter((ListAdapter) bVar);
        b bVar2 = new b(getLayoutInflater(), new ArrayList());
        this.f13222f = bVar2;
        bVar2.a(false);
        this.f13218b.setAdapter((ListAdapter) this.f13222f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        RelativeLayout relativeLayout = this.f13219c;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        View view = this.f13220d;
        if (view != null) {
            view.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView = this.f13217a;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(0);
        }
        b bVar = this.f13222f;
        if (bVar != null) {
            bVar.a();
        }
        TTDislikeListView tTDislikeListView2 = this.f13218b;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(8);
        }
    }

    public void a(n nVar) {
        b bVar = this.f13221e;
        if (bVar == null || nVar == null) {
            return;
        }
        this.f13223g = nVar;
        bVar.a(nVar.ae());
        setMaterialMeta(this.f13223g);
    }

    public void a(a aVar) {
        this.f13224h = aVar;
    }

    public void a(String str) {
        this.f13225i = str;
    }

    private void a() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.y = 50;
            window.setAttributes(attributes);
        }
    }

    private void a(Context context) {
        this.f13219c = (RelativeLayout) findViewById(t.e(getContext(), "tt_dislike_title_content"));
        this.f13220d = findViewById(t.e(getContext(), "tt_dislike_line1"));
        TextView textView = (TextView) findViewById(t.e(getContext(), "tt_dislike_header_back"));
        textView.setText(t.a(getContext(), "tt_dislike_header_tv_back"));
        ((TextView) findViewById(t.e(getContext(), "tt_dislike_header_tv"))).setText(t.a(getContext(), "tt_dislike_header_tv_title"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.c.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                c.this.c();
                if (c.this.f13224h != null) {
                    c.this.f13224h.c();
                }
            }
        });
        TTDislikeListView tTDislikeListView = (TTDislikeListView) findViewById(t.e(getContext(), "tt_filer_words_lv"));
        this.f13217a = tTDislikeListView;
        tTDislikeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.c.4
            /* JADX WARN: Type inference failed for: r1v6, types: [android.widget.Adapter] */
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                try {
                    FilterWord filterWord = (FilterWord) adapterView.getAdapter().getItem(i10);
                    if (filterWord.hasSecondOptions()) {
                        c.this.a(filterWord);
                        if (c.this.f13224h != null) {
                            c.this.f13224h.a(i10, filterWord);
                            return;
                        }
                        return;
                    }
                } catch (Throwable unused) {
                }
                if (c.this.f13224h != null) {
                    try {
                        c.this.f13224h.a(i10, c.this.f13223g.ae().get(i10));
                    } catch (Throwable unused2) {
                    }
                }
                c.this.dismiss();
            }
        });
        this.f13217a.setClosedListenerKey(this.f13225i);
        TTDislikeListView tTDislikeListView2 = (TTDislikeListView) findViewById(t.e(getContext(), "tt_filer_words_lv_second"));
        this.f13218b = tTDislikeListView2;
        tTDislikeListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.c.5
            /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.Adapter] */
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                if (c.this.f13224h != null) {
                    try {
                        c.this.f13224h.a(i10, (FilterWord) adapterView.getAdapter().getItem(i10));
                    } catch (Throwable unused) {
                    }
                }
                c.this.dismiss();
            }
        });
        this.f13218b.setClosedListenerKey(this.f13225i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        b bVar = this.f13222f;
        if (bVar != null) {
            bVar.a(filterWord.getOptions());
        }
        RelativeLayout relativeLayout = this.f13219c;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        View view = this.f13220d;
        if (view != null) {
            view.setVisibility(0);
        }
        TTDislikeListView tTDislikeListView = this.f13217a;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView2 = this.f13218b;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(0);
        }
    }
}
