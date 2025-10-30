package com.noxux.compras_ventas.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

import org.springframework.stereotype.Service;

import com.noxux.compras_ventas.dto.request.UsuarioRequest;
import com.noxux.compras_ventas.dto.response.UsuarioResponse;
import com.noxux.compras_ventas.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public List<UsuarioResponse> findAllUsuarios() {
        try {
            return usuarioRepository.findAll().stream().map(usuario->UsuarioResponse.fromEntity(usuario)).collect(Collectors.toList());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public UsuarioResponse findUsuarioById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUsuarioById'");
    }

    @Override
    public UsuarioResponse createUsuario(UsuarioRequest usuarioRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUsuario'");
    }

    @Override
    public UsuarioResponse updateUsuario(Integer id, UsuarioRequest usuarioRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUsuario'");
    }

    @Override
    public void deleteUsuarioById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUsuarioById'");
    }



}
