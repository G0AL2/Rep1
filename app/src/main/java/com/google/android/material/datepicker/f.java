package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.z;
import androidx.fragment.app.t;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes2.dex */
public final class f<S> extends androidx.fragment.app.c {

    /* renamed from: q  reason: collision with root package name */
    static final Object f22316q = "CONFIRM_BUTTON_TAG";

    /* renamed from: r  reason: collision with root package name */
    static final Object f22317r = "CANCEL_BUTTON_TAG";

    /* renamed from: s  reason: collision with root package name */
    static final Object f22318s = "TOGGLE_BUTTON_TAG";

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashSet<g<? super S>> f22319a = new LinkedHashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashSet<View.OnClickListener> f22320b = new LinkedHashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f22321c = new LinkedHashSet<>();

    /* renamed from: d  reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f22322d = new LinkedHashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private int f22323e;

    /* renamed from: f  reason: collision with root package name */
    private DateSelector<S> f22324f;

    /* renamed from: g  reason: collision with root package name */
    private l<S> f22325g;

    /* renamed from: h  reason: collision with root package name */
    private CalendarConstraints f22326h;

    /* renamed from: i  reason: collision with root package name */
    private e<S> f22327i;

    /* renamed from: j  reason: collision with root package name */
    private int f22328j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f22329k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f22330l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f22331m;

    /* renamed from: n  reason: collision with root package name */
    private CheckableImageButton f22332n;

    /* renamed from: o  reason: collision with root package name */
    private xa.g f22333o;

    /* renamed from: p  reason: collision with root package name */
    private Button f22334p;

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = f.this.f22319a.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(f.this.n());
            }
            f.this.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes2.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = f.this.f22320b.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            f.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes2.dex */
    public class c implements k<S> {
        c() {
        }

        @Override // com.google.android.material.datepicker.k
        public void a(S s10) {
            f.this.t();
            if (f.this.f22324f.Q0()) {
                f.this.f22334p.setEnabled(true);
            } else {
                f.this.f22334p.setEnabled(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes2.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f.this.f22332n.toggle();
            f fVar = f.this;
            fVar.u(fVar.f22332n);
            f.this.r();
        }
    }

    private static Drawable j(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, e.a.b(context, ha.e.f31188b));
        stateListDrawable.addState(new int[0], e.a.b(context, ha.e.f31189c));
        return stateListDrawable;
    }

    private static int k(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(ha.d.f31186z) + resources.getDimensionPixelOffset(ha.d.A) + resources.getDimensionPixelOffset(ha.d.f31185y);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(ha.d.f31181u);
        int i10 = i.f22342e;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(ha.d.f31179s) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(ha.d.f31184x)) + resources.getDimensionPixelOffset(ha.d.f31177q);
    }

    private static int m(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(ha.d.f31178r);
        int i10 = Month.m().f22263e;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(ha.d.f31180t) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(ha.d.f31183w));
    }

    private int o(Context context) {
        int i10 = this.f22323e;
        return i10 != 0 ? i10 : this.f22324f.a(context);
    }

    private void p(Context context) {
        this.f22332n.setTag(f22318s);
        this.f22332n.setImageDrawable(j(context));
        z.q0(this.f22332n, null);
        u(this.f22332n);
        this.f22332n.setOnClickListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean q(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ua.b.c(context, ha.b.f31147r, e.class.getCanonicalName()), new int[]{16843277});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        this.f22327i = e.s(this.f22324f, o(requireContext()), this.f22326h);
        this.f22325g = this.f22332n.isChecked() ? h.d(this.f22324f, this.f22326h) : this.f22327i;
        t();
        t m10 = getChildFragmentManager().m();
        m10.n(ha.f.f31205l, this.f22325g);
        m10.i();
        this.f22325g.b(new c());
    }

    public static long s() {
        return Month.m().f22265g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        String l10 = l();
        this.f22331m.setContentDescription(String.format(getString(ha.j.f31244j), l10));
        this.f22331m.setText(l10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(CheckableImageButton checkableImageButton) {
        String string;
        if (this.f22332n.isChecked()) {
            string = checkableImageButton.getContext().getString(ha.j.f31247m);
        } else {
            string = checkableImageButton.getContext().getString(ha.j.f31249o);
        }
        this.f22332n.setContentDescription(string);
    }

    public String l() {
        return this.f22324f.d(getContext());
    }

    public final S n() {
        return this.f22324f.X0();
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f22321c.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f22323e = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f22324f = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f22326h = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f22328j = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f22329k = bundle.getCharSequence("TITLE_TEXT_KEY");
    }

    @Override // androidx.fragment.app.c
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), o(requireContext()));
        Context context = dialog.getContext();
        this.f22330l = q(context);
        int c10 = ua.b.c(context, ha.b.f31141l, f.class.getCanonicalName());
        xa.g gVar = new xa.g(context, null, ha.b.f31147r, ha.k.f31265n);
        this.f22333o = gVar;
        gVar.L(context);
        this.f22333o.U(ColorStateList.valueOf(c10));
        this.f22333o.T(z.w(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f22330l ? ha.h.f31233m : ha.h.f31232l, viewGroup);
        Context context = inflate.getContext();
        if (this.f22330l) {
            inflate.findViewById(ha.f.f31205l).setLayoutParams(new LinearLayout.LayoutParams(m(context), -2));
        } else {
            View findViewById = inflate.findViewById(ha.f.f31206m);
            View findViewById2 = inflate.findViewById(ha.f.f31205l);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(m(context), -1));
            findViewById2.setMinimumHeight(k(requireContext()));
        }
        TextView textView = (TextView) inflate.findViewById(ha.f.f31211r);
        this.f22331m = textView;
        z.s0(textView, 1);
        this.f22332n = (CheckableImageButton) inflate.findViewById(ha.f.f31212s);
        TextView textView2 = (TextView) inflate.findViewById(ha.f.f31213t);
        CharSequence charSequence = this.f22329k;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f22328j);
        }
        p(context);
        this.f22334p = (Button) inflate.findViewById(ha.f.f31195b);
        if (this.f22324f.Q0()) {
            this.f22334p.setEnabled(true);
        } else {
            this.f22334p.setEnabled(false);
        }
        this.f22334p.setTag(f22316q);
        this.f22334p.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(ha.f.f31194a);
        button.setTag(f22317r);
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f22322d.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f22323e);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f22324f);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.f22326h);
        if (this.f22327i.o() != null) {
            bVar.b(this.f22327i.o().f22265g);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f22328j);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f22329k);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f22330l) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f22333o);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(ha.d.f31182v);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f22333o, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new oa.a(requireDialog(), rect));
        }
        r();
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onStop() {
        this.f22325g.c();
        super.onStop();
    }
}
