package s7;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RegisterTestDeviceViewHolder.java */
/* loaded from: classes2.dex */
public class m extends RecyclerView.d0 {

    /* renamed from: a  reason: collision with root package name */
    private c f36789a;

    /* compiled from: RegisterTestDeviceViewHolder.java */
    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (m.this.f36789a != null) {
                m.this.f36789a.a();
            }
        }
    }

    /* compiled from: RegisterTestDeviceViewHolder.java */
    /* loaded from: classes2.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (m.this.f36789a != null) {
                m.this.f36789a.b();
            }
        }
    }

    /* compiled from: RegisterTestDeviceViewHolder.java */
    /* loaded from: classes2.dex */
    public interface c {
        void a();

        void b();
    }

    public m(View view, c cVar) {
        super(view);
        this.f36789a = cVar;
        ((Button) view.findViewById(com.google.android.ads.mediationtestsuite.d.f20819t)).setOnClickListener(new a());
        ((Button) view.findViewById(com.google.android.ads.mediationtestsuite.d.f20811l)).setOnClickListener(new b());
    }
}
