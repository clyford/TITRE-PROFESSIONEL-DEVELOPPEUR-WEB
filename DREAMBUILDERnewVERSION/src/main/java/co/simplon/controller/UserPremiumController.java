package co.simplon.controller;

import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("hasRole('ROLE_premium')")
@RequestMapping("/premium/")

public class UserPremiumController {
		
	@GetMapping("me")
	//@Tracable
	public ResponseEntity<JSONCredentialInfos> me() {
		JSONCredentialInfos me = new JSONCredentialInfos();
		me.setLogin(SecurityContextHolder.getContext().getAuthentication().getName());
		Set<String> role = AuthorityUtils.authorityListToSet(SecurityContextHolder.getContext().getAuthentication().getAuthorities());
		me.setRoles(role);
		return new ResponseEntity<JSONCredentialInfos>(me, HttpStatus.OK);
	}
}
