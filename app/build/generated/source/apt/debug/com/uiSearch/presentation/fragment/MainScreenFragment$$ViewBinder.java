// Generated code from Butter Knife. Do not modify!
package com.uiSearch.presentation.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainScreenFragment$$ViewBinder<T extends com.uiSearch.presentation.fragment.MainScreenFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361870, "field 'wait1'");
    target.wait1 = view;
    view = finder.findRequiredView(source, 2131361878, "field 'wait2'");
    target.wait2 = view;
    view = finder.findRequiredView(source, 2131361874, "field 'toEditText'");
    target.toEditText = finder.castView(view, 2131361874, "field 'toEditText'");
    view = finder.findRequiredView(source, 2131361866, "field 'fromEditText'");
    target.fromEditText = finder.castView(view, 2131361866, "field 'fromEditText'");
    view = finder.findRequiredView(source, 2131361876, "field 'toMsgOnSpinner'");
    target.toMsgOnSpinner = finder.castView(view, 2131361876, "field 'toMsgOnSpinner'");
    view = finder.findRequiredView(source, 2131361868, "field 'fromMsgOnSpinner'");
    target.fromMsgOnSpinner = finder.castView(view, 2131361868, "field 'fromMsgOnSpinner'");
    view = finder.findRequiredView(source, 2131361865, "field 'fromCountryCodeSpinner' and method 'onItemSelected'");
    target.fromCountryCodeSpinner = finder.castView(view, 2131361865, "field 'fromCountryCodeSpinner'");
    ((android.widget.AdapterView<?>) view).setOnItemSelectedListener(
      new android.widget.AdapterView.OnItemSelectedListener() {
        @Override public void onItemSelected(
          android.widget.AdapterView<?> p0,
          android.view.View p1,
          int p2,
          long p3
        ) {
          target.onItemSelected(p0, p1, p2, p3);
        }
        @Override public void onNothingSelected(
          android.widget.AdapterView<?> p0
        ) {
          
        }
      });
    view = finder.findRequiredView(source, 2131361873, "field 'toCountryCodeSpinner' and method 'onItemSelected'");
    target.toCountryCodeSpinner = finder.castView(view, 2131361873, "field 'toCountryCodeSpinner'");
    ((android.widget.AdapterView<?>) view).setOnItemSelectedListener(
      new android.widget.AdapterView.OnItemSelectedListener() {
        @Override public void onItemSelected(
          android.widget.AdapterView<?> p0,
          android.view.View p1,
          int p2,
          long p3
        ) {
          target.onItemSelected(p0, p1, p2, p3);
        }
        @Override public void onNothingSelected(
          android.widget.AdapterView<?> p0
        ) {
          
        }
      });
    view = finder.findRequiredView(source, 2131361861, "field 'parentLayout'");
    target.parentLayout = finder.castView(view, 2131361861, "field 'parentLayout'");
    view = finder.findRequiredView(source, 2131361884, "field 'customImageView'");
    target.customImageView = finder.castView(view, 2131361884, "field 'customImageView'");
    view = finder.findRequiredView(source, 2131361869, "field 'linearLayout'");
    target.linearLayout = finder.castView(view, 2131361869, "field 'linearLayout'");
    view = finder.findRequiredView(source, 2131361883, "field 'linearLayoutInScrollView'");
    target.linearLayoutInScrollView = finder.castView(view, 2131361883, "field 'linearLayoutInScrollView'");
    view = finder.findRequiredView(source, 2131361882, "field 'scrollView' and method 'onTouch'");
    target.scrollView = finder.castView(view, 2131361882, "field 'scrollView'");
    view.setOnTouchListener(
      new android.view.View.OnTouchListener() {
        @Override public boolean onTouch(
          android.view.View p0,
          android.view.MotionEvent p1
        ) {
          return target.onTouch(p0, p1);
        }
      });
    view = finder.findRequiredView(source, 2131361880, "method 'onClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    target.wait1 = null;
    target.wait2 = null;
    target.toEditText = null;
    target.fromEditText = null;
    target.toMsgOnSpinner = null;
    target.fromMsgOnSpinner = null;
    target.fromCountryCodeSpinner = null;
    target.toCountryCodeSpinner = null;
    target.parentLayout = null;
    target.customImageView = null;
    target.linearLayout = null;
    target.linearLayoutInScrollView = null;
    target.scrollView = null;
  }
}
