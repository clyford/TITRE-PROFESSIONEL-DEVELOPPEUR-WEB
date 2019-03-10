package co.simplon.controller;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
@Data
public class JSONCredentialInfos {
	private String login;
	private Set<String> roles = new HashSet<String>();	//liste de role a modifier pour mon projet
}
