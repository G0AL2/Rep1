package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.k0;
import androidx.core.view.z;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* renamed from: a  reason: collision with root package name */
    private final Context f742a;

    /* renamed from: b  reason: collision with root package name */
    final androidx.appcompat.app.h f743b;

    /* renamed from: c  reason: collision with root package name */
    private final Window f744c;

    /* renamed from: d  reason: collision with root package name */
    private final int f745d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f746e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f747f;

    /* renamed from: g  reason: collision with root package name */
    ListView f748g;

    /* renamed from: h  reason: collision with root package name */
    private View f749h;

    /* renamed from: i  reason: collision with root package name */
    private int f750i;

    /* renamed from: j  reason: collision with root package name */
    private int f751j;

    /* renamed from: k  reason: collision with root package name */
    private int f752k;

    /* renamed from: l  reason: collision with root package name */
    private int f753l;

    /* renamed from: m  reason: collision with root package name */
    private int f754m;

    /* renamed from: o  reason: collision with root package name */
    Button f756o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f757p;

    /* renamed from: q  reason: collision with root package name */
    Message f758q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f759r;

    /* renamed from: s  reason: collision with root package name */
    Button f760s;

    /* renamed from: t  reason: collision with root package name */
    private CharSequence f761t;

    /* renamed from: u  reason: collision with root package name */
    Message f762u;

    /* renamed from: v  reason: collision with root package name */
    private Drawable f763v;

    /* renamed from: w  reason: collision with root package name */
    Button f764w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f765x;

    /* renamed from: y  reason: collision with root package name */
    Message f766y;

    /* renamed from: z  reason: collision with root package name */
    private Drawable f767z;

    /* renamed from: n  reason: collision with root package name */
    private boolean f755n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: a  reason: collision with root package name */
        private final int f768a;

        /* renamed from: b  reason: collision with root package name */
        private final int f769b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.j.W1);
            this.f769b = obtainStyledAttributes.getDimensionPixelOffset(d.j.X1, -1);
            this.f768a = obtainStyledAttributes.getDimensionPixelOffset(d.j.Y1, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f768a, getPaddingRight(), z11 ? getPaddingBottom() : this.f769b);
        }
    }

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message obtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f756o && (message3 = alertController.f758q) != null) {
                obtain = Message.obtain(message3);
            } else if (view == alertController.f760s && (message2 = alertController.f762u) != null) {
                obtain = Message.obtain(message2);
            } else {
                obtain = (view != alertController.f764w || (message = alertController.f766y) == null) ? null : Message.obtain(message);
            }
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f743b).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements NestedScrollView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f771a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f772b;

        b(AlertController alertController, View view, View view2) {
            this.f771a = view;
            this.f772b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.b
        public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
            AlertController.g(nestedScrollView, this.f771a, this.f772b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f773a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f774b;

        c(View view, View view2) {
            this.f773a = view;
            this.f774b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.A, this.f773a, this.f774b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements AbsListView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f776a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f777b;

        d(AlertController alertController, View view, View view2) {
            this.f776a = view;
            this.f777b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            AlertController.g(absListView, this.f776a, this.f777b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f778a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f779b;

        e(View view, View view2) {
            this.f778a = view;
            this.f779b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.f748g, this.f778a, this.f779b);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;

        /* renamed from: a  reason: collision with root package name */
        public final Context f781a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f782b;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f784d;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f786f;

        /* renamed from: g  reason: collision with root package name */
        public View f787g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f788h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f789i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f790j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f791k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f792l;

        /* renamed from: m  reason: collision with root package name */
        public Drawable f793m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f794n;

        /* renamed from: o  reason: collision with root package name */
        public CharSequence f795o;

        /* renamed from: p  reason: collision with root package name */
        public Drawable f796p;

        /* renamed from: q  reason: collision with root package name */
        public DialogInterface.OnClickListener f797q;

        /* renamed from: s  reason: collision with root package name */
        public DialogInterface.OnCancelListener f799s;

        /* renamed from: t  reason: collision with root package name */
        public DialogInterface.OnDismissListener f800t;

        /* renamed from: u  reason: collision with root package name */
        public DialogInterface.OnKeyListener f801u;

        /* renamed from: v  reason: collision with root package name */
        public CharSequence[] f802v;

        /* renamed from: w  reason: collision with root package name */
        public ListAdapter f803w;

        /* renamed from: x  reason: collision with root package name */
        public DialogInterface.OnClickListener f804x;

        /* renamed from: y  reason: collision with root package name */
        public int f805y;

        /* renamed from: z  reason: collision with root package name */
        public View f806z;

        /* renamed from: c  reason: collision with root package name */
        public int f783c = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f785e = 0;
        public boolean E = false;
        public int I = -1;

        /* renamed from: r  reason: collision with root package name */
        public boolean f798r = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends ArrayAdapter<CharSequence> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RecycleListView f807a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f807a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f807a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b extends CursorAdapter {

            /* renamed from: a  reason: collision with root package name */
            private final int f809a;

            /* renamed from: b  reason: collision with root package name */
            private final int f810b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ RecycleListView f811c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ AlertController f812d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f811c = recycleListView;
                this.f812d = alertController;
                Cursor cursor2 = getCursor();
                this.f809a = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f810b = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f809a));
                this.f811c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f810b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f782b.inflate(this.f812d.M, viewGroup, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AlertController f814a;

            c(AlertController alertController) {
                this.f814a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                f.this.f804x.onClick(this.f814a.f743b, i10);
                if (f.this.H) {
                    return;
                }
                this.f814a.f743b.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RecycleListView f816a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AlertController f817b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f816a = recycleListView;
                this.f817b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f816a.isItemChecked(i10);
                }
                f.this.J.onClick(this.f817b.f743b, i10, this.f816a.isItemChecked(i10));
            }
        }

        /* loaded from: classes.dex */
        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f781a = context;
            this.f782b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            int i10;
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f782b.inflate(alertController.L, (ViewGroup) null);
            if (this.G) {
                if (this.K == null) {
                    listAdapter = new a(this.f781a, alertController.M, 16908308, this.f802v, recycleListView);
                } else {
                    listAdapter = new b(this.f781a, this.K, false, recycleListView, alertController);
                }
            } else {
                if (this.H) {
                    i10 = alertController.N;
                } else {
                    i10 = alertController.O;
                }
                int i11 = i10;
                if (this.K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f781a, i11, this.K, new String[]{this.L}, new int[]{16908308});
                } else {
                    listAdapter = this.f803w;
                    if (listAdapter == null) {
                        listAdapter = new h(this.f781a, i11, 16908308, this.f802v);
                    }
                }
            }
            e eVar = this.O;
            if (eVar != null) {
                eVar.a(recycleListView);
            }
            alertController.H = listAdapter;
            alertController.I = this.I;
            if (this.f804x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.H) {
                recycleListView.setChoiceMode(1);
            } else if (this.G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f748g = recycleListView;
        }

        public void a(AlertController alertController) {
            View view = this.f787g;
            if (view != null) {
                alertController.m(view);
            } else {
                CharSequence charSequence = this.f786f;
                if (charSequence != null) {
                    alertController.r(charSequence);
                }
                Drawable drawable = this.f784d;
                if (drawable != null) {
                    alertController.o(drawable);
                }
                int i10 = this.f783c;
                if (i10 != 0) {
                    alertController.n(i10);
                }
                int i11 = this.f785e;
                if (i11 != 0) {
                    alertController.n(alertController.d(i11));
                }
            }
            CharSequence charSequence2 = this.f788h;
            if (charSequence2 != null) {
                alertController.p(charSequence2);
            }
            CharSequence charSequence3 = this.f789i;
            if (charSequence3 != null || this.f790j != null) {
                alertController.l(-1, charSequence3, this.f791k, null, this.f790j);
            }
            CharSequence charSequence4 = this.f792l;
            if (charSequence4 != null || this.f793m != null) {
                alertController.l(-2, charSequence4, this.f794n, null, this.f793m);
            }
            CharSequence charSequence5 = this.f795o;
            if (charSequence5 != null || this.f796p != null) {
                alertController.l(-3, charSequence5, this.f797q, null, this.f796p);
            }
            if (this.f802v != null || this.K != null || this.f803w != null) {
                b(alertController);
            }
            View view2 = this.f806z;
            if (view2 != null) {
                if (this.E) {
                    alertController.u(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.t(view2);
                    return;
                }
            }
            int i12 = this.f805y;
            if (i12 != 0) {
                alertController.s(i12);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class g extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<DialogInterface> f819a;

        public g(DialogInterface dialogInterface) {
            this.f819a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f819a.get(), message.what);
            } else if (i10 != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, androidx.appcompat.app.h hVar, Window window) {
        this.f742a = context;
        this.f743b = hVar;
        this.f744c = window;
        this.R = new g(hVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, d.j.D, d.a.f28668n, 0);
        this.J = obtainStyledAttributes.getResourceId(d.j.E, 0);
        this.K = obtainStyledAttributes.getResourceId(d.j.G, 0);
        this.L = obtainStyledAttributes.getResourceId(d.j.I, 0);
        this.M = obtainStyledAttributes.getResourceId(d.j.J, 0);
        this.N = obtainStyledAttributes.getResourceId(d.j.L, 0);
        this.O = obtainStyledAttributes.getResourceId(d.j.H, 0);
        this.P = obtainStyledAttributes.getBoolean(d.j.K, true);
        this.f745d = obtainStyledAttributes.getDimensionPixelSize(d.j.F, 0);
        obtainStyledAttributes.recycle();
        hVar.d(1);
    }

    private static boolean A(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(d.a.f28667m, typedValue, true);
        return typedValue.data != 0;
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void g(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    private ViewGroup j(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int k() {
        int i10 = this.K;
        if (i10 == 0) {
            return this.J;
        }
        return this.Q == 1 ? i10 : this.J;
    }

    private void q(ViewGroup viewGroup, View view, int i10, int i11) {
        View findViewById = this.f744c.findViewById(d.f.f28752v);
        View findViewById2 = this.f744c.findViewById(d.f.f28751u);
        if (Build.VERSION.SDK_INT >= 23) {
            z.H0(view, i10, i11);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i10 & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i10 & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById == null && findViewById2 == null) {
            return;
        }
        if (this.f747f != null) {
            this.A.setOnScrollChangeListener(new b(this, findViewById, findViewById2));
            this.A.post(new c(findViewById, findViewById2));
            return;
        }
        ListView listView = this.f748g;
        if (listView != null) {
            listView.setOnScrollListener(new d(this, findViewById, findViewById2));
            this.f748g.post(new e(findViewById, findViewById2));
            return;
        }
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    private void v(ViewGroup viewGroup) {
        boolean z10;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f756o = button;
        button.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f757p) && this.f759r == null) {
            this.f756o.setVisibility(8);
            z10 = false;
        } else {
            this.f756o.setText(this.f757p);
            Drawable drawable = this.f759r;
            if (drawable != null) {
                int i10 = this.f745d;
                drawable.setBounds(0, 0, i10, i10);
                this.f756o.setCompoundDrawables(this.f759r, null, null, null);
            }
            this.f756o.setVisibility(0);
            z10 = true;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f760s = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f761t) && this.f763v == null) {
            this.f760s.setVisibility(8);
        } else {
            this.f760s.setText(this.f761t);
            Drawable drawable2 = this.f763v;
            if (drawable2 != null) {
                int i11 = this.f745d;
                drawable2.setBounds(0, 0, i11, i11);
                this.f760s.setCompoundDrawables(this.f763v, null, null, null);
            }
            this.f760s.setVisibility(0);
            z10 |= true;
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f764w = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f765x) && this.f767z == null) {
            this.f764w.setVisibility(8);
        } else {
            this.f764w.setText(this.f765x);
            Drawable drawable3 = this.f767z;
            if (drawable3 != null) {
                int i12 = this.f745d;
                drawable3.setBounds(0, 0, i12, i12);
                this.f764w.setCompoundDrawables(this.f767z, null, null, null);
            }
            this.f764w.setVisibility(0);
            z10 |= true;
        }
        if (A(this.f742a)) {
            if (z10) {
                b(this.f756o);
            } else if (z10) {
                b(this.f760s);
            } else if (z10) {
                b(this.f764w);
            }
        }
        if (z10) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void w(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f744c.findViewById(d.f.f28753w);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f747f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f748g != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
            int indexOfChild = viewGroup2.indexOfChild(this.A);
            viewGroup2.removeViewAt(indexOfChild);
            viewGroup2.addView(this.f748g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void x(ViewGroup viewGroup) {
        View view = this.f749h;
        if (view == null) {
            view = this.f750i != 0 ? LayoutInflater.from(this.f742a).inflate(this.f750i, viewGroup, false) : null;
        }
        boolean z10 = view != null;
        if (!z10 || !a(view)) {
            this.f744c.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) this.f744c.findViewById(d.f.f28744n);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f755n) {
                frameLayout.setPadding(this.f751j, this.f752k, this.f753l, this.f754m);
            }
            if (this.f748g != null) {
                ((LinearLayout.LayoutParams) ((k0.a) viewGroup.getLayoutParams())).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void y(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f744c.findViewById(d.f.O).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f744c.findViewById(16908294);
        if ((!TextUtils.isEmpty(this.f746e)) && this.P) {
            TextView textView = (TextView) this.f744c.findViewById(d.f.f28740j);
            this.E = textView;
            textView.setText(this.f746e);
            int i10 = this.B;
            if (i10 != 0) {
                this.D.setImageResource(i10);
                return;
            }
            Drawable drawable = this.C;
            if (drawable != null) {
                this.D.setImageDrawable(drawable);
                return;
            }
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
            return;
        }
        this.f744c.findViewById(d.f.O).setVisibility(8);
        this.D.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void z() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f744c.findViewById(d.f.f28750t);
        int i10 = d.f.P;
        View findViewById4 = findViewById3.findViewById(i10);
        int i11 = d.f.f28743m;
        View findViewById5 = findViewById3.findViewById(i11);
        int i12 = d.f.f28741k;
        View findViewById6 = findViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(d.f.f28745o);
        x(viewGroup);
        View findViewById7 = viewGroup.findViewById(i10);
        View findViewById8 = viewGroup.findViewById(i11);
        View findViewById9 = viewGroup.findViewById(i12);
        ViewGroup j10 = j(findViewById7, findViewById4);
        ViewGroup j11 = j(findViewById8, findViewById5);
        ViewGroup j12 = j(findViewById9, findViewById6);
        w(j11);
        v(j12);
        y(j10);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (j10 == null || j10.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (j12 == null || j12.getVisibility() == 8) ? false : true;
        if (!z12 && j11 != null && (findViewById2 = j11.findViewById(d.f.K)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z11) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (this.f747f != null || this.f748g != null) {
                view = j10.findViewById(d.f.N);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (j11 != null && (findViewById = j11.findViewById(d.f.L)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f748g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view2 = this.f748g;
            if (view2 == null) {
                view2 = this.A;
            }
            if (view2 != null) {
                q(j11, view2, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f748g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i13 = this.I;
        if (i13 > -1) {
            listView2.setItemChecked(i13, true);
            listView2.setSelection(i13);
        }
    }

    public Button c(int i10) {
        if (i10 != -3) {
            if (i10 != -2) {
                if (i10 != -1) {
                    return null;
                }
                return this.f756o;
            }
            return this.f760s;
        }
        return this.f764w;
    }

    public int d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f742a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f748g;
    }

    public void f() {
        this.f743b.setContentView(k());
        z();
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.q(keyEvent);
    }

    public boolean i(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.q(keyEvent);
    }

    public void l(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f765x = charSequence;
            this.f766y = message;
            this.f767z = drawable;
        } else if (i10 == -2) {
            this.f761t = charSequence;
            this.f762u = message;
            this.f763v = drawable;
        } else if (i10 == -1) {
            this.f757p = charSequence;
            this.f758q = message;
            this.f759r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void m(View view) {
        this.G = view;
    }

    public void n(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i10 != 0) {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public void o(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public void p(CharSequence charSequence) {
        this.f747f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(CharSequence charSequence) {
        this.f746e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void s(int i10) {
        this.f749h = null;
        this.f750i = i10;
        this.f755n = false;
    }

    public void t(View view) {
        this.f749h = view;
        this.f750i = 0;
        this.f755n = false;
    }

    public void u(View view, int i10, int i11, int i12, int i13) {
        this.f749h = view;
        this.f750i = 0;
        this.f755n = true;
        this.f751j = i10;
        this.f752k = i11;
        this.f753l = i12;
        this.f754m = i13;
    }
}
