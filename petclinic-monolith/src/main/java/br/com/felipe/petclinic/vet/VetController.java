/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.felipe.petclinic.vet;

import br.com.felipe.petclinic.common.StandardResponseDTO;
import br.com.felipe.petclinic.vet.dto.VetRequestDTO;
import br.com.felipe.petclinic.vet.dto.VetResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/vets")
final class VetController {
    private VetService service;

    @PostMapping
    public ResponseEntity<StandardResponseDTO<VetResponseDTO>> save(@RequestBody VetRequestDTO dto){
        return new ResponseEntity<>(new StandardResponseDTO<>(service.create(dto), "Sucesso"), HttpStatus.OK);
    }
}
