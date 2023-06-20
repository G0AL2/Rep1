package com.applovin.impl.mediation.debugger.ui.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class d extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private List<c> f7720a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private Map<Integer, Integer> f7721b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    protected Context f7722c;

    /* renamed from: d  reason: collision with root package name */
    private a f7723d;

    /* renamed from: e  reason: collision with root package name */
    private LayoutInflater f7724e;

    /* loaded from: classes.dex */
    public interface a {
        void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, c cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Context context) {
        this.f7722c = context;
    }

    private LayoutInflater a() {
        LayoutInflater layoutInflater = this.f7724e;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflater2 = (LayoutInflater) this.f7722c.getSystemService("layout_inflater");
        this.f7724e = layoutInflater2;
        return layoutInflater2;
    }

    private com.applovin.impl.mediation.debugger.ui.d.a e(int i10) {
        for (int i11 = 0; i11 < b(); i11++) {
            Integer num = this.f7721b.get(Integer.valueOf(i11));
            if (num != null) {
                if (i10 <= num.intValue() + a(i11)) {
                    return new com.applovin.impl.mediation.debugger.ui.d.a(i11, i10 - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    protected abstract int a(int i10);

    public Bitmap a(ListView listView) {
        int count = getCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), 1073741824);
        int i10 = 0;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ArrayList<Bitmap> arrayList = new ArrayList(count);
        int i11 = 0;
        for (int i12 = 0; i12 < count; i12++) {
            View view = getView(i12, null, listView);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            arrayList.add(createBitmap);
            i11 += view.getMeasuredHeight();
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(listView.getMeasuredWidth(), i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint();
        for (Bitmap bitmap : arrayList) {
            canvas.drawBitmap(bitmap, 0.0f, i10, paint);
            i10 += bitmap.getHeight();
            bitmap.recycle();
        }
        return createBitmap2;
    }

    public void a(a aVar) {
        this.f7723d = aVar;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    protected abstract int b();

    protected abstract c b(int i10);

    protected abstract List<c> c(int i10);

    @Override // android.widget.Adapter
    /* renamed from: d */
    public c getItem(int i10) {
        return this.f7720a.get(i10);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f7720a.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i10) {
        return getItem(i10).i();
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        b bVar;
        c item = getItem(i10);
        if (view == null) {
            view = a().inflate(item.j(), viewGroup, false);
            bVar = new b();
            bVar.f7680a = (TextView) view.findViewById(16908308);
            bVar.f7681b = (TextView) view.findViewById(16908309);
            bVar.f7682c = (ImageView) view.findViewById(R.id.imageView);
            bVar.f7683d = (ImageView) view.findViewById(R.id.detailImageView);
            view.setTag(bVar);
            view.setOnClickListener(this);
        } else {
            bVar = (b) view.getTag();
        }
        bVar.a(i10);
        bVar.a(item);
        view.setEnabled(item.b());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return c.h();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i10) {
        return getItem(i10).b();
    }

    public void j() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.debugger.ui.d.d.1
            @Override // java.lang.Runnable
            public void run() {
                d.this.notifyDataSetChanged();
            }
        });
    }

    protected c k() {
        return null;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f7720a = new ArrayList();
        Integer num = 0;
        Integer valueOf = Integer.valueOf(b());
        this.f7721b = new HashMap(valueOf.intValue());
        c k10 = k();
        if (k10 != null) {
            this.f7720a.add(k10);
            num = Integer.valueOf(num.intValue() + 1);
        }
        for (int i10 = 0; i10 < valueOf.intValue(); i10++) {
            Integer valueOf2 = Integer.valueOf(a(i10));
            if (valueOf2.intValue() != 0) {
                this.f7720a.add(b(i10));
                this.f7720a.addAll(c(i10));
                this.f7721b.put(Integer.valueOf(i10), num);
                num = Integer.valueOf(num.intValue() + valueOf2.intValue() + 1);
            }
        }
        this.f7720a.add(new e(""));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        b bVar = (b) view.getTag();
        c b10 = bVar.b();
        com.applovin.impl.mediation.debugger.ui.d.a e10 = e(bVar.a());
        a aVar = this.f7723d;
        if (aVar == null || e10 == null) {
            return;
        }
        aVar.a(e10, b10);
    }
}
