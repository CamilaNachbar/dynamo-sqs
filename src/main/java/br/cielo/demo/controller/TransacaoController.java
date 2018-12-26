package br.cielo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cielo.demo.model.TransacaoRequisicaoPlataformaTransferencia;
import br.cielo.demo.model.TransacaoRequisicaoPlataformaTransferenciaSort;
import br.cielo.demo.repo.TransacaoRepository;
import br.cielo.demo.repo.TransacaoSortRepository;
import br.cielo.demo.service.TransacaoRequisicaoService;

@RestController
public class TransacaoController {

	@Autowired
	private TransacaoRepository repository;

	@Autowired
	private TransacaoSortRepository sortRepository;

	@Autowired
	private TransacaoRequisicaoService service;

	@Value("${cloud.aws.end-point.uri}")
	private String sqsEndPoint;

	@RequestMapping("/findall")
	public List<TransacaoRequisicaoPlataformaTransferencia> findAll() {
		return repository.findAll();
	}

	@PostMapping("/add")
	public TransacaoRequisicaoPlataformaTransferencia create(
			@RequestBody TransacaoRequisicaoPlataformaTransferencia transacao) {
		return service.createTransacao(transacao);
	}

	@RequestMapping("/sort/findall")
	public List<TransacaoRequisicaoPlataformaTransferenciaSort> findSortAll() {
		return sortRepository.findAll();
	}

}
