package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import ha.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PasswordToggleEndIconDelegate.java */
/* loaded from: classes3.dex */
public class h extends e {

    /* renamed from: d  reason: collision with root package name */
    private final TextWatcher f22725d;

    /* renamed from: e  reason: collision with root package name */
    private final TextInputLayout.f f22726e;

    /* renamed from: f  reason: collision with root package name */
    private final TextInputLayout.g f22727f;

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* loaded from: classes3.dex */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            h hVar = h.this;
            hVar.f22698c.setChecked(!hVar.f());
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* loaded from: classes3.dex */
    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            h hVar = h.this;
            hVar.f22698c.setChecked(!hVar.f());
            editText.removeTextChangedListener(h.this.f22725d);
            editText.addTextChangedListener(h.this.f22725d);
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* loaded from: classes3.dex */
    class c implements TextInputLayout.g {
        c(h hVar) {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i10 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* loaded from: classes3.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = h.this.f22696a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (h.this.f()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f22725d = new a();
        this.f22726e = new b();
        this.f22727f = new c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        EditText editText = this.f22696a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public void a() {
        this.f22696a.setEndIconDrawable(e.a.b(this.f22697b, ha.e.f31187a));
        TextInputLayout textInputLayout = this.f22696a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(j.f31251q));
        this.f22696a.setEndIconOnClickListener(new d());
        this.f22696a.c(this.f22726e);
        this.f22696a.d(this.f22727f);
    }
}
