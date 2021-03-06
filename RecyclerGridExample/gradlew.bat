// Generated code from Butter Knife. Do not modify!
package mantis.gds.app.view.login;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.IllegalStateException;
import java.lang.Override;
import mantis.gds.app.R;

public class LoginFragment_ViewBinding implements Unbinder {
  private LoginFragment target;

  @UiThread
  public LoginFragment_ViewBinding(LoginFragment target, View source) {
    this.target = target;

    target.etCode = Utils.findRequiredViewAsType(source, R.id.et_code, "field 'etCode'", TextInputEditText.class);
    target.etLogin = Utils.findRequiredViewAsType(source, R.id.et_login, "field 'etLogin'", TextInputEditText.class);
    target.etPassword = Utils.findRequiredViewAsType(source, R.id.et_password, "field 'etPassword'", TextInputEditText.class);
    target.submit = Utils.findRequiredViewAsType(source, R.id.btn_submit, "field 'submit'", Button.class);
    target.loginPanel = Utils.findRequiredViewAsType(source, R.id.login_content, "field 'loginPanel'", ViewGroup.class);
    target.tvVersionName = Utils.findRequiredViewAsType(source, R.id.tv_version_name, "field 'tvVersionName'", TextView.class);
    target.progress = Utils.findRequiredView(source, R.id.progress_bar, "field 'progress'");
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.etCode = null;
    target.etLogin = null;
    target.etPassword = null;
    target.submit = null;
    target.loginPanel = null;
    target.tvVersionName = null;
    target.progress = null;
  }
}
                                                                                                                                                                                                                                                                                                                                           