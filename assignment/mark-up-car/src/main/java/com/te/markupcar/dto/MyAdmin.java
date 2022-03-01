package com.te.markupcar.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyAdmin implements UserDetails {
	
	@Autowired
	private Admin admin;
	
	
	
	

	public MyAdmin(Admin admin) {
		
		this.admin = admin;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority authority= new SimpleGrantedAuthority(admin.getRole());
		List<SimpleGrantedAuthority> list=new ArrayList<SimpleGrantedAuthority>();
		list.add(authority);
		return list;
	}

	@Override
	public String getPassword() {
		
		return admin.getPassword();
	}

	@Override
	public String getUsername() {
		
		return admin.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		return true;
	}

}
