package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.p;
import androidx.core.view.z;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes3.dex */
public class CheckableImageButton extends p implements Checkable {

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f22441g = {16842912};

    /* renamed from: d  reason: collision with root package name */
    private boolean f22442d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f22443e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f22444f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        boolean f22445c;

        /* loaded from: classes3.dex */
        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void e(Parcel parcel) {
            this.f22445c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f22445c ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            e(parcel);
        }
    }

    /* loaded from: classes3.dex */
    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.a
        public void g(View view, i0.c cVar) {
            super.g(view, cVar);
            cVar.Y(CheckableImageButton.this.a());
            cVar.Z(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.C);
    }

    public boolean a() {
        return this.f22443e;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f22442d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (this.f22442d) {
            int[] iArr = f22441g;
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.c());
        setChecked(savedState.f22445c);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f22445c = this.f22442d;
        return savedState;
    }

    public void setCheckable(boolean z10) {
        if (this.f22443e != z10) {
            this.f22443e = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f22443e || this.f22442d == z10) {
            return;
        }
        this.f22442d = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.f22444f = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f22444f) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f22442d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22443e = true;
        this.f22444f = true;
        z.q0(this, new a());
    }
}
