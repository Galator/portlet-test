package com.poc.portlet.portlet;

import com.poc.portlet.constants.portletPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author Gaalator
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=Gluo",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=Portlet Testing",//+ portletPortletKeys.PORTLET,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)


public class portletPortlet extends MVCPortlet {
	
	void test () {}
	
	void test2 () {}
	
	void test3 () {}
	
	void test4 () {}
	
	void test5 () {}
	
	void test6 () {}
	
void test7 () {}
	
	void test8 () {}
	
	void test9 () {}
}
