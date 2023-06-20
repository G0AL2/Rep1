package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.c;

/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements androidx.core.view.x {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f1233i = {16843505};

    /* renamed from: a  reason: collision with root package name */
    private final androidx.appcompat.widget.e f1234a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1235b;

    /* renamed from: c  reason: collision with root package name */
    private j0 f1236c;

    /* renamed from: d  reason: collision with root package name */
    private SpinnerAdapter f1237d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f1238e;

    /* renamed from: f  reason: collision with root package name */
    private f f1239f;

    /* renamed from: g  reason: collision with root package name */
    int f1240g;

    /* renamed from: h  reason: collision with root package name */
    final Rect f1241h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        boolean f1242a;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f1242a ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1242a = parcel.readByte() != 0;
        }
    }

    /* loaded from: classes.dex */
    class a extends j0 {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ e f1243j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.f1243j = eVar;
        }

        @Override // androidx.appcompat.widget.j0
        public j.e b() {
            return this.f1243j;
        }

        @Override // androidx.appcompat.widget.j0
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (AppCompatSpinner.this.getInternalPopup().a()) {
                return true;
            }
            AppCompatSpinner.this.b();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().a()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements f, DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        androidx.appcompat.app.c f1246a;

        /* renamed from: b  reason: collision with root package name */
        private ListAdapter f1247b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f1248c;

        c() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public boolean a() {
            androidx.appcompat.app.c cVar = this.f1246a;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public int c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void dismiss() {
            androidx.appcompat.app.c cVar = this.f1246a;
            if (cVar != null) {
                cVar.dismiss();
                this.f1246a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void e(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public CharSequence f() {
            return this.f1248c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public Drawable g() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void h(CharSequence charSequence) {
            this.f1248c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void i(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void k(int i10, int i11) {
            if (this.f1247b == null) {
                return;
            }
            c.a aVar = new c.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f1248c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            androidx.appcompat.app.c create = aVar.f(this.f1247b, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.f1246a = create;
            ListView f10 = create.f();
            if (Build.VERSION.SDK_INT >= 17) {
                f10.setTextDirection(i10);
                f10.setTextAlignment(i11);
            }
            this.f1246a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public int l() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void m(ListAdapter listAdapter) {
            this.f1247b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            AppCompatSpinner.this.setSelection(i10);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i10, this.f1247b.getItemId(i10));
            }
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private SpinnerAdapter f1250a;

        /* renamed from: b  reason: collision with root package name */
        private ListAdapter f1251b;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1250a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1251b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                } else if (spinnerAdapter instanceof v0) {
                    v0 v0Var = (v0) spinnerAdapter;
                    if (v0Var.getDropDownViewTheme() == null) {
                        v0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1251b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1250a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1250a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1250a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1250a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1250a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f1251b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1250a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1250a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* loaded from: classes.dex */
    class e extends l0 implements f {
        private CharSequence I;
        ListAdapter J;
        private final Rect K;
        private int L;

        /* loaded from: classes.dex */
        class a implements AdapterView.OnItemClickListener {
            a(AppCompatSpinner appCompatSpinner) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                AppCompatSpinner.this.setSelection(i10);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    AppCompatSpinner.this.performItemClick(view, i10, eVar.J.getItemId(i10));
                }
                e.this.dismiss();
            }
        }

        /* loaded from: classes.dex */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.P(AppCompatSpinner.this)) {
                    e.this.dismiss();
                    return;
                }
                e.this.N();
                e.super.show();
            }
        }

        /* loaded from: classes.dex */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1254a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1254a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1254a);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.K = new Rect();
            y(AppCompatSpinner.this);
            E(true);
            J(0);
            G(new a(AppCompatSpinner.this));
        }

        void N() {
            int O;
            Drawable g10 = g();
            int i10 = 0;
            if (g10 != null) {
                g10.getPadding(AppCompatSpinner.this.f1241h);
                i10 = g1.b(AppCompatSpinner.this) ? AppCompatSpinner.this.f1241h.right : -AppCompatSpinner.this.f1241h.left;
            } else {
                Rect rect = AppCompatSpinner.this.f1241h;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i11 = appCompatSpinner.f1240g;
            if (i11 == -2) {
                int a10 = appCompatSpinner.a((SpinnerAdapter) this.J, g());
                int i12 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f1241h;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (a10 > i13) {
                    a10 = i13;
                }
                A(Math.max(a10, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                A((width - paddingLeft) - paddingRight);
            } else {
                A(i11);
            }
            if (g1.b(AppCompatSpinner.this)) {
                O = i10 + (((width - paddingRight) - u()) - O());
            } else {
                O = i10 + paddingLeft + O();
            }
            e(O);
        }

        public int O() {
            return this.L;
        }

        boolean P(View view) {
            return androidx.core.view.z.T(view) && view.getGlobalVisibleRect(this.K);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public CharSequence f() {
            return this.I;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void h(CharSequence charSequence) {
            this.I = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void j(int i10) {
            this.L = i10;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void k(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean a10 = a();
            N();
            D(2);
            super.show();
            ListView o10 = o();
            o10.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                o10.setTextDirection(i10);
                o10.setTextAlignment(i11);
            }
            K(AppCompatSpinner.this.getSelectedItemPosition());
            if (a10 || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            F(new c(bVar));
        }

        @Override // androidx.appcompat.widget.l0, androidx.appcompat.widget.AppCompatSpinner.f
        public void m(ListAdapter listAdapter) {
            super.m(listAdapter);
            this.J = listAdapter;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface f {
        boolean a();

        void b(Drawable drawable);

        int c();

        void dismiss();

        void e(int i10);

        CharSequence f();

        Drawable g();

        void h(CharSequence charSequence);

        void i(int i10);

        void j(int i10);

        void k(int i10, int i11);

        int l();

        void m(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.J);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f1241h);
            Rect rect = this.f1241h;
            return i11 + rect.left + rect.right;
        }
        return i11;
    }

    void b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1239f.k(getTextDirection(), getTextAlignment());
        } else {
            this.f1239f.k(-1, -1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f1234a;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        f fVar = this.f1239f;
        if (fVar != null) {
            return fVar.c();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        f fVar = this.f1239f;
        if (fVar != null) {
            return fVar.l();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f1239f != null) {
            return this.f1240g;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    final f getInternalPopup() {
        return this.f1239f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        f fVar = this.f1239f;
        if (fVar != null) {
            return fVar.g();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1235b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        f fVar = this.f1239f;
        return fVar != null ? fVar.f() : super.getPrompt();
    }

    @Override // androidx.core.view.x
    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f1234a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.x
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f1234a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.f1239f;
        if (fVar == null || !fVar.a()) {
            return;
        }
        this.f1239f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1239f == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f1242a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.f1239f;
        savedState.f1242a = fVar != null && fVar.a();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        j0 j0Var = this.f1236c;
        if (j0Var == null || !j0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        f fVar = this.f1239f;
        if (fVar != null) {
            if (fVar.a()) {
                return true;
            }
            b();
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f1234a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        androidx.appcompat.widget.e eVar = this.f1234a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        f fVar = this.f1239f;
        if (fVar != null) {
            fVar.j(i10);
            this.f1239f.e(i10);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        f fVar = this.f1239f;
        if (fVar != null) {
            fVar.i(i10);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f1239f != null) {
            this.f1240g = i10;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.f1239f;
        if (fVar != null) {
            fVar.b(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(e.a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        f fVar = this.f1239f;
        if (fVar != null) {
            fVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // androidx.core.view.x
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f1234a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.x
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f1234a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1238e) {
            this.f1237d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1239f != null) {
            Context context = this.f1235b;
            if (context == null) {
                context = getContext();
            }
            this.f1239f.m(new d(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r11 == null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.appcompat.widget.AppCompatSpinner, android.view.View, android.widget.Spinner] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
