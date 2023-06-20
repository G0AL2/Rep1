package o0;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* compiled from: EmojiInputConnection.java */
/* loaded from: classes.dex */
final class c extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f34845a;

    /* renamed from: b  reason: collision with root package name */
    private final a f34846b;

    /* compiled from: EmojiInputConnection.java */
    /* loaded from: classes.dex */
    public static class a {
        public boolean a(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
            return androidx.emoji2.text.d.e(inputConnection, editable, i10, i11, z10);
        }

        public void b(EditorInfo editorInfo) {
            if (androidx.emoji2.text.d.h()) {
                androidx.emoji2.text.d.b().u(editorInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    private Editable a() {
        return this.f34845a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        return this.f34846b.a(this, a(), i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return this.f34846b.a(this, a(), i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.f34845a = textView;
        this.f34846b = aVar;
        aVar.b(editorInfo);
    }
}
