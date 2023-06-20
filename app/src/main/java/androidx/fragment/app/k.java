package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentLayoutInflaterFactory.java */
/* loaded from: classes.dex */
public class k implements LayoutInflater.Factory2 {

    /* renamed from: a  reason: collision with root package name */
    final FragmentManager f3157a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentLayoutInflaterFactory.java */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f3158a;

        a(q qVar) {
            this.f3158a = qVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment k10 = this.f3158a.k();
            this.f3158a.m();
            z.n((ViewGroup) k10.mView.getParent(), k.this.f3157a).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(FragmentManager fragmentManager) {
        this.f3157a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        q w10;
        if (g.class.getName().equals(str)) {
            return new g(context, attributeSet, this.f3157a);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q0.c.f35764a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(q0.c.f35765b);
            }
            int resourceId = obtainStyledAttributes.getResourceId(q0.c.f35766c, -1);
            String string = obtainStyledAttributes.getString(q0.c.f35767d);
            obtainStyledAttributes.recycle();
            if (attributeValue == null || !i.b(context.getClassLoader(), attributeValue)) {
                return null;
            }
            int id2 = view != null ? view.getId() : 0;
            if (id2 == -1 && resourceId == -1 && string == null) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
            }
            Fragment h02 = resourceId != -1 ? this.f3157a.h0(resourceId) : null;
            if (h02 == null && string != null) {
                h02 = this.f3157a.i0(string);
            }
            if (h02 == null && id2 != -1) {
                h02 = this.f3157a.h0(id2);
            }
            if (h02 == null) {
                h02 = this.f3157a.r0().a(context.getClassLoader(), attributeValue);
                h02.mFromLayout = true;
                h02.mFragmentId = resourceId != 0 ? resourceId : id2;
                h02.mContainerId = id2;
                h02.mTag = string;
                h02.mInLayout = true;
                FragmentManager fragmentManager = this.f3157a;
                h02.mFragmentManager = fragmentManager;
                h02.mHost = fragmentManager.u0();
                h02.onInflate(this.f3157a.u0().f(), attributeSet, h02.mSavedFragmentState);
                w10 = this.f3157a.g(h02);
                if (FragmentManager.G0(2)) {
                    Log.v("FragmentManager", "Fragment " + h02 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else if (!h02.mInLayout) {
                h02.mInLayout = true;
                FragmentManager fragmentManager2 = this.f3157a;
                h02.mFragmentManager = fragmentManager2;
                h02.mHost = fragmentManager2.u0();
                h02.onInflate(this.f3157a.u0().f(), attributeSet, h02.mSavedFragmentState);
                w10 = this.f3157a.w(h02);
                if (FragmentManager.G0(2)) {
                    Log.v("FragmentManager", "Retained Fragment " + h02 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            h02.mContainer = (ViewGroup) view;
            w10.m();
            w10.j();
            View view2 = h02.mView;
            if (view2 != null) {
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (h02.mView.getTag() == null) {
                    h02.mView.setTag(string);
                }
                h02.mView.addOnAttachStateChangeListener(new a(w10));
                return h02.mView;
            }
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        return null;
    }
}
