package o0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.d;
import com.google.android.gms.common.api.Api;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: EmojiTextWatcher.java */
/* loaded from: classes.dex */
final class g implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    private final EditText f34858a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f34859b;

    /* renamed from: c  reason: collision with root package name */
    private d.e f34860c;

    /* renamed from: d  reason: collision with root package name */
    private int f34861d = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: e  reason: collision with root package name */
    private int f34862e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f34863f = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmojiTextWatcher.java */
    /* loaded from: classes.dex */
    public static class a extends d.e {

        /* renamed from: a  reason: collision with root package name */
        private final Reference<EditText> f34864a;

        a(EditText editText) {
            this.f34864a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.d.e
        public void b() {
            super.b();
            g.b(this.f34864a.get(), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(EditText editText, boolean z10) {
        this.f34858a = editText;
        this.f34859b = z10;
    }

    private d.e a() {
        if (this.f34860c == null) {
            this.f34860c = new a(this.f34858a);
        }
        return this.f34860c;
    }

    static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.d.b().o(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        return (this.f34863f && (this.f34859b || androidx.emoji2.text.d.h())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void c(boolean z10) {
        if (this.f34863f != z10) {
            if (this.f34860c != null) {
                androidx.emoji2.text.d.b().t(this.f34860c);
            }
            this.f34863f = z10;
            if (z10) {
                b(this.f34858a, androidx.emoji2.text.d.b().d());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f34858a.isInEditMode() || d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int d10 = androidx.emoji2.text.d.b().d();
        if (d10 != 0) {
            if (d10 == 1) {
                androidx.emoji2.text.d.b().r((Spannable) charSequence, i10, i10 + i12, this.f34861d, this.f34862e);
                return;
            } else if (d10 != 3) {
                return;
            }
        }
        androidx.emoji2.text.d.b().s(a());
    }
}
