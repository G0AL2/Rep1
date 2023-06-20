package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import ba.l;
import ba.s;
import ca.o;
import i9.w0;
import i9.y0;
import j8.p1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final int f21659a;

    /* renamed from: b  reason: collision with root package name */
    private final LayoutInflater f21660b;

    /* renamed from: c  reason: collision with root package name */
    private final CheckedTextView f21661c;

    /* renamed from: d  reason: collision with root package name */
    private final CheckedTextView f21662d;

    /* renamed from: e  reason: collision with root package name */
    private final b f21663e;

    /* renamed from: f  reason: collision with root package name */
    private final SparseArray<l.f> f21664f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f21665g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f21666h;

    /* renamed from: i  reason: collision with root package name */
    private o f21667i;

    /* renamed from: j  reason: collision with root package name */
    private CheckedTextView[][] f21668j;

    /* renamed from: k  reason: collision with root package name */
    private s.a f21669k;

    /* renamed from: l  reason: collision with root package name */
    private int f21670l;

    /* renamed from: m  reason: collision with root package name */
    private y0 f21671m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f21672n;

    /* renamed from: o  reason: collision with root package name */
    private Comparator<c> f21673o;

    /* renamed from: p  reason: collision with root package name */
    private d f21674p;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.d(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f21676a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21677b;

        /* renamed from: c  reason: collision with root package name */
        public final p1 f21678c;

        public c(int i10, int i11, p1 p1Var) {
            this.f21676a = i10;
            this.f21677b = i11;
            this.f21678c = p1Var;
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(boolean z10, List<l.f> list);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static int[] b(int[] iArr, int i10) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[copyOf.length - 1] = i10;
        return copyOf;
    }

    private static int[] c(int[] iArr, int i10) {
        int[] iArr2 = new int[iArr.length - 1];
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 != i10) {
                iArr2[i11] = i12;
                i11++;
            }
        }
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(View view) {
        if (view == this.f21661c) {
            f();
        } else if (view == this.f21662d) {
            e();
        } else {
            g(view);
        }
        j();
        d dVar = this.f21674p;
        if (dVar != null) {
            dVar.a(getIsDisabled(), getOverrides());
        }
    }

    private void e() {
        this.f21672n = false;
        this.f21664f.clear();
    }

    private void f() {
        this.f21672n = true;
        this.f21664f.clear();
    }

    private void g(View view) {
        this.f21672n = false;
        c cVar = (c) ea.a.e(view.getTag());
        int i10 = cVar.f21676a;
        int i11 = cVar.f21677b;
        l.f fVar = this.f21664f.get(i10);
        ea.a.e(this.f21669k);
        if (fVar == null) {
            if (!this.f21666h && this.f21664f.size() > 0) {
                this.f21664f.clear();
            }
            this.f21664f.put(i10, new l.f(i10, i11));
            return;
        }
        int i12 = fVar.f5093c;
        int[] iArr = fVar.f5092b;
        boolean isChecked = ((CheckedTextView) view).isChecked();
        boolean h10 = h(i10);
        boolean z10 = h10 || i();
        if (isChecked && z10) {
            if (i12 == 1) {
                this.f21664f.remove(i10);
            } else {
                this.f21664f.put(i10, new l.f(i10, c(iArr, i11)));
            }
        } else if (isChecked) {
        } else {
            if (h10) {
                this.f21664f.put(i10, new l.f(i10, b(iArr, i11)));
            } else {
                this.f21664f.put(i10, new l.f(i10, i11));
            }
        }
    }

    private boolean h(int i10) {
        return this.f21665g && this.f21671m.b(i10).f31846a > 1 && this.f21669k.a(this.f21670l, i10, false) != 0;
    }

    private boolean i() {
        return this.f21666h && this.f21671m.f31863a > 1;
    }

    private void j() {
        this.f21661c.setChecked(this.f21672n);
        this.f21662d.setChecked(!this.f21672n && this.f21664f.size() == 0);
        for (int i10 = 0; i10 < this.f21668j.length; i10++) {
            l.f fVar = this.f21664f.get(i10);
            int i11 = 0;
            while (true) {
                CheckedTextView[][] checkedTextViewArr = this.f21668j;
                if (i11 < checkedTextViewArr[i10].length) {
                    if (fVar != null) {
                        this.f21668j[i10][i11].setChecked(fVar.b(((c) ea.a.e(checkedTextViewArr[i10][i11].getTag())).f21677b));
                    } else {
                        checkedTextViewArr[i10][i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    private void k() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f21669k == null) {
            this.f21661c.setEnabled(false);
            this.f21662d.setEnabled(false);
            return;
        }
        this.f21661c.setEnabled(true);
        this.f21662d.setEnabled(true);
        y0 f10 = this.f21669k.f(this.f21670l);
        this.f21671m = f10;
        this.f21668j = new CheckedTextView[f10.f31863a];
        boolean i10 = i();
        int i11 = 0;
        while (true) {
            y0 y0Var = this.f21671m;
            if (i11 < y0Var.f31863a) {
                w0 b10 = y0Var.b(i11);
                boolean h10 = h(i11);
                CheckedTextView[][] checkedTextViewArr = this.f21668j;
                int i12 = b10.f31846a;
                checkedTextViewArr[i11] = new CheckedTextView[i12];
                c[] cVarArr = new c[i12];
                for (int i13 = 0; i13 < b10.f31846a; i13++) {
                    cVarArr[i13] = new c(i11, i13, b10.c(i13));
                }
                Comparator<c> comparator = this.f21673o;
                if (comparator != null) {
                    Arrays.sort(cVarArr, comparator);
                }
                for (int i14 = 0; i14 < i12; i14++) {
                    if (i14 == 0) {
                        addView(this.f21660b.inflate(ca.l.f5378a, (ViewGroup) this, false));
                    }
                    CheckedTextView checkedTextView = (CheckedTextView) this.f21660b.inflate((h10 || i10) ? 17367056 : 17367055, (ViewGroup) this, false);
                    checkedTextView.setBackgroundResource(this.f21659a);
                    checkedTextView.setText(this.f21667i.a(cVarArr[i14].f21678c));
                    checkedTextView.setTag(cVarArr[i14]);
                    if (this.f21669k.g(this.f21670l, i11, i14) == 4) {
                        checkedTextView.setFocusable(true);
                        checkedTextView.setOnClickListener(this.f21663e);
                    } else {
                        checkedTextView.setFocusable(false);
                        checkedTextView.setEnabled(false);
                    }
                    this.f21668j[i11][i14] = checkedTextView;
                    addView(checkedTextView);
                }
                i11++;
            } else {
                j();
                return;
            }
        }
    }

    public boolean getIsDisabled() {
        return this.f21672n;
    }

    public List<l.f> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f21664f.size());
        for (int i10 = 0; i10 < this.f21664f.size(); i10++) {
            arrayList.add(this.f21664f.valueAt(i10));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f21665g != z10) {
            this.f21665g = z10;
            k();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f21666h != z10) {
            this.f21666h = z10;
            if (!z10 && this.f21664f.size() > 1) {
                for (int size = this.f21664f.size() - 1; size > 0; size--) {
                    this.f21664f.remove(size);
                }
            }
            k();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f21661c.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(o oVar) {
        this.f21667i = (o) ea.a.e(oVar);
        k();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        this.f21664f = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f21659a = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f21660b = from;
        b bVar = new b();
        this.f21663e = bVar;
        this.f21667i = new ca.e(getResources());
        this.f21671m = y0.f31861d;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f21661c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(ca.m.f5397q);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(ca.l.f5378a, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f21662d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(ca.m.f5396p);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}
